import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistryMarks = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = sc.nextDouble();

        
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;

        
        System.out.println("Total Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");

        
        String grade = "";
        String remarks = "";

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
