import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) result.append(Character.toUpperCase(ch));
            else result.append(ch);
        }

        System.out.println("Toggled case: " + result);
    }
}
