import java.util.Random;

public class StudentGrades {
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(41) + 60; 
            scores[i][1] = rand.nextInt(41) + 60; 
            scores[i][2] = rand.nextInt(41) + 60; 
        }
        return scores;
    }

    public static double[] computeTotalsAndPercentages(int[] scores) {
        int total = scores[0] + scores[1] + scores[2];
        double avg = total / 3.0;
        return new double[]{total, avg};
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        return "F";
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5); 

        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            double[] result = computeTotalsAndPercentages(scores[i]);
            String grade = calculateGrade(result[1]);
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%s\n", 
                              i + 1, scores[i][0], scores[i][1], scores[i][2], 
                              (int) result[0], result[1], grade);
        }
    }
}
