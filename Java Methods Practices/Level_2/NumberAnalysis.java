import java.util.Scanner;

public class NumberAnalysis {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is positive and ");
                System.out.println(isEven(num) ? "even." : "odd.");
            } else {
                System.out.println(num + " is negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        if (comparison > 0)
            System.out.println("First number is greater than last.");
        else if (comparison < 0)
            System.out.println("First number is smaller than last.");
        else
            System.out.println("First and last numbers are equal.");
    }
}
