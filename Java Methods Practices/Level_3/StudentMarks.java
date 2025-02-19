import java.util.Random;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateResults(scores);

        displayResults(results);
    }

    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(101); 
            scores[i][1] = rand.nextInt(101); 
            scores[i][2] = rand.nextInt(101); 
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; 

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 3.0);
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(average * 100.0) / 100.0; 
        }

        return results;
    }

    public static void displayResults(double[][] results) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%\n", (i + 1), (int)results[i][0], (int)results[i][1], (int)results[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }
}
