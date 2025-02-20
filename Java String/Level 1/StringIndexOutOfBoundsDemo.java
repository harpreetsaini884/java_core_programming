import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    
    public static void generateException() {
        String text = "Hello";
        System.out.println(text.charAt(10));
    }

    
    public static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        sc.close();
    }

    public static void main(String[] args) {
        handleException();
    }
}
