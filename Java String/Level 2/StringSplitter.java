import java.util.Scanner;
import java.util.Arrays;

public class StringSplitter {
    public static String[] splitText(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int wordStart = 0, index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[index] = text.substring(wordStart);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        scanner.close();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(customSplit));
        System.out.println("Built-in Split: " + Arrays.toString(builtInSplit));
        System.out.println("Are both splits identical? " + compareArrays(customSplit, builtInSplit));
    }
}
