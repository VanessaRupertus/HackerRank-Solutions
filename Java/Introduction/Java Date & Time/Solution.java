/*
You are given a date. You just need to write the method, findDay, which returns the day on that date.
To simplify your task, we have provided a portion of the code in the editor.
 */
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

class Solution {
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int date = c.get(Calendar.DAY_OF_WEEK);
        return days.get(date-1);
    }
}