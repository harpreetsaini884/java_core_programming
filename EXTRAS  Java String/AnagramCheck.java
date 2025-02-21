import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        char[] str1 = scanner.nextLine().toCharArray();
        System.out.print("Enter second string: ");
        char[] str2 = scanner.nextLine().toCharArray();
        scanner.close();

        Arrays.sort(str1);
        Arrays.sort(str2);

        System.out.println(Arrays.equals(str1, str2) ? "Anagrams" : "Not Anagrams");
    }
}
