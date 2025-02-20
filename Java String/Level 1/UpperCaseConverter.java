import java.util.Scanner;

public class UpperCaseConverter {

    
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
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

        String upperManual = convertToUpperCase(text);
        String upperBuiltIn = text.toUpperCase();

        System.out.println("Converted using manual method: " + upperManual);
        System.out.println("Converted using built-in method: " + upperBuiltIn);

        System.out.println("Are both conversions equal? " + compareStrings(upperManual, upperBuiltIn));

        sc.close();
    }
}
