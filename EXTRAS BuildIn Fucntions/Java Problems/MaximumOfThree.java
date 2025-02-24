import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("The maximum number is: " + Math.max(a, Math.max(b, c)));
        scanner.close();
    }
}