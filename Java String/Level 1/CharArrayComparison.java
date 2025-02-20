import java.util.Scanner;

public class CharArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        
        char[] manualCharArray = getCharactersManually(inputString);

        char[] builtInCharArray = inputString.toCharArray();

        boolean comparisonResult = compareCharArrays(manualCharArray, builtInCharArray);

        System.out.println("\nCharacters using manual method: " + new String(manualCharArray));
        System.out.println("Characters using built-in toCharArray(): " + new String(builtInCharArray));
        System.out.println("Are both character arrays equal? " + comparisonResult);

        sc.close();
    }
    public static char[] getCharactersManually(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
