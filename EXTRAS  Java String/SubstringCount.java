import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String sub = scanner.nextLine();
        scanner.close();

        int count = 0, index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        System.out.println("Occurrences: " + count);
    }
}
