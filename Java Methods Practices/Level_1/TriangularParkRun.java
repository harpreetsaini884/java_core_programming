import java.util.Scanner;

public class TriangularParkRun {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangular park in meters: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("The athlete needs to complete " + calculateRounds(a, b, c) + " rounds.");
        sc.close();
    }
}
