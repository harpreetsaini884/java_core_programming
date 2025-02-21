import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        int minLength = Math.min(str1.length(), str2.length());
        int result = 0;
        
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        if (result == 0 && str1.length() != str2.length()) {
            result = str1.length() - str2.length();
        }

        if (result < 0) System.out.println(str1 + " comes before " + str2);
        else if (result > 0) System.out.println(str2 + " comes before " + str1);
        else System.out.println("Both strings are equal");
    }
}
