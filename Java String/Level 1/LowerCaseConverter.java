import java.util.Scanner;

public class LowerCaseConverter {

    
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            result.append(ch);
        }
        return result.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String lowerManual = convertToLowerCase(text);
        String lowerBuiltIn = text.toLowerCase();

        System.out.println("Converted using manual method: " + lowerManual);
        System.out.println("Converted using built-in method: " + lowerBuiltIn);

        System.out.println("Are both conversions equal? " + compareStrings(lowerManual, lowerBuiltIn));

        sc.close();
    }
}
