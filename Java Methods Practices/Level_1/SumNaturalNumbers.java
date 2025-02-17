import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumOfN(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Enter a positive integer.");
        } else {
            System.out.println("Sum of first " + n + " natural numbers is: " + sumOfN(n));
        }
        sc.close();
    }
}
