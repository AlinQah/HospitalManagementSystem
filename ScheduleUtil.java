/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project;

import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ScheduleUtil {

    private static final Map<String, DayOfWeek> dayMap = Map.ofEntries(
            Map.entry("Sun", DayOfWeek.SUNDAY), Map.entry("Sunday", DayOfWeek.SUNDAY),
            Map.entry("Mon", DayOfWeek.MONDAY), Map.entry("Monday", DayOfWeek.MONDAY),
            Map.entry("Tue", DayOfWeek.TUESDAY), Map.entry("Tuesday", DayOfWeek.TUESDAY),
            Map.entry("Wed", DayOfWeek.WEDNESDAY), Map.entry("Wednesday", DayOfWeek.WEDNESDAY),
            Map.entry("Thu", DayOfWeek.THURSDAY), Map.entry("Thursday", DayOfWeek.THURSDAY),
            Map.entry("Fri", DayOfWeek.FRIDAY), Map.entry("Friday", DayOfWeek.FRIDAY),
            Map.entry("Sat", DayOfWeek.SATURDAY), Map.entry("Saturday", DayOfWeek.SATURDAY)
    );

    public static Map<String, List<String>> getAvailableDateTimes(String schedule, int doctorId) throws Exception {
        Map<String, List<String>> result = new LinkedHashMap<>();
        LocalDate today = LocalDate.now();

        // دعم كلمة Daily
        if (schedule.startsWith("Daily")) {
            schedule = "Sat-Fri" + schedule.substring(5); // يحول Daily 8am-12pm إلى Sat-Fri 8am-12pm
        }

        Pattern p = Pattern.compile("([A-Za-z]+)-([A-Za-z]+) (\\d+)(am|pm)-(\\d+)(am|pm)");

        Matcher m = p.matcher(schedule);
        while (m.find()) {
            DayOfWeek startDay = dayMap.get(m.group(1));
            DayOfWeek endDay = dayMap.get(m.group(2));
            int startHour = convertTo24(m.group(3), m.group(4));
            int endHour = convertTo24(m.group(5), m.group(6));
            Set<DayOfWeek> workingDays = getDayRange(startDay, endDay);

            for (int i = 0; i < 14; i++) {
                LocalDate date = today.plusDays(i);
                if (!workingDays.contains(date.getDayOfWeek())) {
                    continue;
                }

                List<String> times = result.getOrDefault(date.toString(), new ArrayList<>());
                for (int h = startHour; h < endHour; h++) {
                    LocalDateTime dateTime = date.atTime(h, 0);
                    if (!isBooked(doctorId, dateTime)) {
                        times.add(dateTime.format(DateTimeFormatter.ofPattern("hh:mm a")));
                    }
                }

                if (!times.isEmpty()) {
                    result.put(date.toString(), times);
                }
            }
        }

        return result;
    }

    private static boolean isBooked(int doctorId, LocalDateTime dt) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB", "hospital", "hospital");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM Appointment WHERE DoctorID = ? AND AppointmentDate = ?");
        ps.setInt(1, doctorId);
        ps.setTimestamp(2, Timestamp.valueOf(dt));
        ResultSet rs = ps.executeQuery();
        boolean booked = rs.next();
        rs.close();
        ps.close();
        con.close();
        return booked;
    }

    private static int convertTo24(String hourStr, String ampm) {
        int hour = Integer.parseInt(hourStr);
        if (ampm.equalsIgnoreCase("pm") && hour != 12) hour += 12;
        if (ampm.equalsIgnoreCase("am") && hour == 12) hour = 0;
        return hour;
    }

    private static Set<DayOfWeek> getDayRange(DayOfWeek start, DayOfWeek end) {
        Set<DayOfWeek> days = EnumSet.noneOf(DayOfWeek.class);
        int s = start.getValue();
        int e = end.getValue();
        for (int i = 0; i < 7; i++) {
            int d = (s + i - 1) % 7 + 1;
            days.add(DayOfWeek.of(d));
            if (d == e) break;
        }
        return days;
    }
}