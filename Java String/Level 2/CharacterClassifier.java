import java.util.Scanner;

public class CharacterClassifier {
    public static String classifyCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        if (Character.isLetter(ch)) {
            return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyString(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = classifyCharacter(str.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();

        String[][] classifiedChars = classifyString(text);
        System.out.println("Character\tType");
        for (String[] row : classifiedChars) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
