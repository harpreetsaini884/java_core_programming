import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] freq = new int[256];
        for (char c : input.toCharArray()) freq[c]++;

        char mostFrequent = ' ';
        int maxCount = 0;
        for (char c : input.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                mostFrequent = c;
            }
        }

        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
