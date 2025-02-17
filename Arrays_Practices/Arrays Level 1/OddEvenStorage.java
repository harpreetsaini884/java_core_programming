import java.util.Scanner;

public class OddEvenStorage {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int limit = scanner.nextInt();

        if (limit < 1) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        System.out.print("Even numbers: ");
        for (int i = 2; i <= limit; i += 2) {
            System.out.print(i + " ");
        }

        System.out.print("\nOdd numbers: ");
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        scanner.close();
    }
}
