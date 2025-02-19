import java.util.Scanner;

public class QuadraticEquationSolver {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            return new double[]{(-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)};
        } else if (delta == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            return new double[0];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 2) {
            System.out.println("Roots: " + roots[0] + ", " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("No real roots.");
        }
    }
}
