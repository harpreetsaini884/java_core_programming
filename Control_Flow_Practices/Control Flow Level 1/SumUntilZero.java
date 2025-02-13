import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = sc.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }
        System.out.println("Total sum: " + total);
    }
}
