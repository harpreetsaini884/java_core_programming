import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] employees = new int[10][2]; 
        
        for (int i = 0; i < 10; i++) {
            employees[i][0] = 10000 + rand.nextInt(90000);  
            employees[i][1] = rand.nextInt(21); 
        }

        double totalBonus = 0;
        double totalSalary = 0;
        double totalNewSalary = 0;

        System.out.println("Employee Details:");
        for (int i = 0; i < 10; i++) {
            double bonus = calculateBonus(employees[i][0], employees[i][1]);
            double newSalary = employees[i][0] + bonus;

            totalBonus += bonus;
            totalSalary += employees[i][0];
            totalNewSalary += newSalary;

            System.out.println("Employee " + (i + 1) + " - Salary: " + employees[i][0] + ", Years of Service: " + employees[i][1] +
                               ", Bonus: " + bonus + ", New Salary: " + newSalary);
        }

        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static double calculateBonus(int salary, int yearsOfService) {
        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return salary * 0.02;
        }
    }
}
