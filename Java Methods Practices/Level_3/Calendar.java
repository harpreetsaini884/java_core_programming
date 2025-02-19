import java.util.Scanner;

public class Calendar {
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

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int day = 1;


        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    ");
        }

        for (int i = firstDayOfMonth; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }
        System.out.println();

        while (day <= daysInMonth) {
            for (int i = 0; i < 7 && day <= daysInMonth; i++) {
                System.out.printf("%3d ", day++);
            }
            System.out.println();
        }
    }

    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getFirstDayOfMonth(int month, int year) {
        
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m / 12) % 7;
    }
}
