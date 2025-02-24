import java.util.Scanner;

public class FibonacciGenerator {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms = scanner.nextInt();
        generateFibonacci(terms);
        scanner.close();
    }
}