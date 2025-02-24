import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String response;

        System.out.println("Think of a number between 1 and 100 and I will guess it!");
        while (true) {
            guess = low + (high - low) / 2;
            System.out.println("Is your number " + guess + "? (higher/lower/correct)");
            response = scanner.next();
            if (response.equals("higher")) {
                low = guess + 1;
            } else if (response.equals("lower")) {
                high = guess - 1;
            } else {
                System.out.println("Hooray! I guessed your number.");
                break;
            }
        }
        scanner.close();
    }
}