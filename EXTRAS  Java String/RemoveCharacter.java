import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        String result = input.replace(String.valueOf(ch), "");
        System.out.println("Modified String: " + result);
    }
}
