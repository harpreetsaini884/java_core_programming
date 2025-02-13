import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, originalNum = num;
        
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        if (originalNum % sum == 0) {
            System.out.println(originalNum + " is a Harshad number.");
        } else {
            System.out.println(originalNum + " is not a Harshad number.");
        }
    }
}
