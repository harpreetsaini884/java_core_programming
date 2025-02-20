import java.util.Scanner;

public class NumberFormatDemo {


    public static void generateException() {
        String text = "ABC123";
        int number = Integer.parseInt(text); 
        System.out.println("Converted number: " + number);
    }

    
    public static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = sc.nextLine();

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        sc.close();
    }

    public static void main(String[] args) {
        
        handleException();
    }
}
