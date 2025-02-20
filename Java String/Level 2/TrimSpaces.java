import java.util.Scanner;

public class TrimSpaces {
    public static String trimString(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;

        StringBuilder trimmed = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmed.append(str.charAt(i));
        }
        return trimmed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = scanner.nextLine();
        scanner.close();

        String customTrimmed = trimString(text);
        String builtInTrimmed = text.trim();

        System.out.println("Custom Trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are both trims identical? " + customTrimmed.equals(builtInTrimmed));
    }
}
