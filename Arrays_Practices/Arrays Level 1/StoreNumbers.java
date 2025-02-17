import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();
            
            if (input <= 0 || index == 10) {
                break;
            }

            numbers[index] = input;
            total += input;
            index++;
        }
        System.out.println("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total sum: " + total);
    }
}
