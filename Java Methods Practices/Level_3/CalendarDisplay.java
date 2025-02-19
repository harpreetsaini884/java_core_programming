import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("\nCalendar for " + getMonthName(month) + " " + year);

        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);

        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        int day = 1;
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("\t");
        }

        while (day <= daysInMonth) {
            System.out.printf("%3d\t", day);

            if ((firstDayOfMonth + day) % 7 == 0) {
                System.out.println();
            }

            day++;
        }
    }

    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;  
        }

        return daysInMonths[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        
        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int firstDay = (1 + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return (firstDay + 5) % 7;  
    }
}
