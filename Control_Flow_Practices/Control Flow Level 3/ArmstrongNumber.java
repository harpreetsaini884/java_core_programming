import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, originalNumber, remainder;
        
        originalNumber = num;
        
        while (num != 0) {
            remainder = num % 10;
            sum += Math.pow(remainder, 3);
            num /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
