import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') length++;
        } catch (Exception e) {
            return length;
        }
        return length;
    }

    public static char[] findUniqueCharacters(String str) {
        int len = getLength(str);
        char[] uniqueChars = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) uniqueChars[index++] = str.charAt(i);
        }

        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] uniqueChars = findUniqueCharacters(input);
        System.out.println("Unique characters: " + new String(uniqueChars));
        scanner.close();
    }
}
