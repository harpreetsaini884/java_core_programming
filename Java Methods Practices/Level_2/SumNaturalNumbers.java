import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumRecursively(int n) {
        if (n == 0) return 0;
        return n + sumRecursively(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int recursiveSum = sumRecursively(n);
        int formulaSum = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Both results are equal: " + (recursiveSum == formulaSum));
    }
}
