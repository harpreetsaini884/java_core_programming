import java.util.Scanner;

public class ShortestLongestWord {
    public static String[] splitText(String text) {
        return text.split(" ");
    }

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (getStringLength(word) < getStringLength(shortest)) {
                shortest = word;
            }
            if (getStringLength(word) > getStringLength(longest)) {
                longest = word;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        scanner.close();

        String[] words = splitText(text);
        String[] result = findShortestAndLongest(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
