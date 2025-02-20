import java.util.Scanner;

public class IllegalArgumentDemo {

    
    public static void generateException() {
        String text = "Example";
        System.out.println(text.substring(5, 2)); 
    }

    
    public static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        sc.close();
    }

    public static void main(String[] args) {
        
        handleException();
    }
}
