import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            int factorial = 1;
            while (number > 0) {
                factorial *= number;
                number--;
            }
            System.out.println("Factorial: " + factorial);
        }
    }
}
