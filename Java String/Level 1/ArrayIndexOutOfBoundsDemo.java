import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    
    public static void generateException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(names[5]); 
    }

    
    public static void handleException() {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.print("Enter index to access (0-2): ");
        int index = sc.nextInt();

        try {
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        sc.close();
    }

    public static void main(String[] args) {
        
        handleException();
    }
}
