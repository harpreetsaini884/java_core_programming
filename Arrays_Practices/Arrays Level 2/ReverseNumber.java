import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
