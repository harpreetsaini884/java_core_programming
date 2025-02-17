import java.util.Scanner;

public class HandshakesCalculator {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
        
        if (students < 2) {
            System.out.println("At least 2 students are needed for a handshake.");
        } else {
            System.out.println("Maximum possible handshakes: " + calculateHandshakes(students));
        }
        sc.close();
    }
}
