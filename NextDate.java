public class NextDate {
    private static final int DAYS_IN_JAN = 31;
    private static final int DAYS_IN_FEB = 28;
    private static final int DAYS_IN_FEB_LEAP = 29;
    private static final int DAYS_IN_MAR = 31;
    private static final int DAYS_IN_APR = 30;
    private static final int DAYS_IN_MAY = 31;
    private static final int DAYS_IN_JUN = 30;
    private static final int DAYS_IN_JUL = 31;
    private static final int DAYS_IN_AUG = 31;
    private static final int DAYS_IN_SEP = 30;
    private static final int DAYS_IN_OCT = 31;
    private static final int DAYS_IN_NOV = 30;
    private static final int DAYS_IN_DEC = 31;

    private static final int JAN = 1;
    private static final int FEB = 2;
    private static final int MAR = 3;
    private static final int APR = 4;
    private static final int MAY = 5;
    private static final int JUN = 6;
    private static final int JUL = 7;
    private static final int AUG = 8;
    private static final int SEP = 9;
    private static final int OCT = 10;
    private static final int NOV = 11;
    private static final int DEC = 12;

    public static boolean IsLeap(int year) {
        boolean result = false;

        if (year % 4 == 0) {
            result = true;
            if (year >= 100 && year % 100 == 0) {
                result = false;
                if (year >= 400 && year % 400 == 0) {
                    result = true;
                }
            }
        }

        return result;
    }

    public static int getNextDay(int day, int month, int year) {
        if (month == JAN && day == DAYS_IN_JAN
                || IsLeap(year) && month == FEB && day == DAYS_IN_FEB_LEAP
                || !IsLeap(year) && month == FEB && day == DAYS_IN_FEB
                || month == MAR && day == DAYS_IN_MAR
                || month == APR && day == DAYS_IN_APR
                || month == MAY && day == DAYS_IN_MAY
                || month == JUN && day == DAYS_IN_JUN
                || month == JUL && day == DAYS_IN_JUL
                || month == AUG && day == DAYS_IN_AUG
                || month == SEP && day == DAYS_IN_SEP
                || month == OCT && day == DAYS_IN_OCT
                || month == NOV && day == DAYS_IN_NOV
                || month == DEC && day == DAYS_IN_DEC
                ) {
            day = 1;
        } else {
            day++;
        }

        return day;
    }

    public static int getNextMonth(int day, int month, int year) {
        //int nextDay = getNextDay(day, month, year);
        if (day == 1) {
            if (month == DEC) {
                month = JAN;
            } else {
                month++;
            }
        }

        return month;
    }

    public static int getNextYear(int day, int month, int year) {
        if (month == JAN && day == 1) {
            year++;
        }

        return year;
    }

    public static String GenerateResultMessage(int day, int month, int year) {
        int nextDay = getNextDay(day, month, year);
        int nextMonth = getNextMonth(nextDay, month, year);
        int nextYear = getNextYear(nextDay, nextMonth, year);

        return "Today's date " + day + "." + month + "." + year
                + ".Tomorrow's date " + nextDay + "." + nextMonth + "." + nextYear + ".";
    }
}
