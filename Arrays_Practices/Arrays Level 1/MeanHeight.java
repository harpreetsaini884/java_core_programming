import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter height: ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        System.out.println("Mean height: " + (sum / 11));
        scanner.close();
    }
}



// class Employee{
//     String name;
//     int id;
//     Employee(String name,int id){
//         this.name=name;
//         this.id=id;
//     }
    
//     @Override
//     public String toString() {
//         return "Employee [name=" + name + ", id=" + id + "]";
//     }

//     public String getName() {
//         return name;
//     }

//     public int getId() {
//         return id;
//     }


    
// }
// public class Main{
//     public static void main(String[] args){
//         Employee e1=new Employee("Harpreet",21);
//         System.out.println(e1);
//         Employee e2=new Employee("Harpreet",21);
//         System.out.println(e2);
//         if(e1.equals(e2)){
//             System.out.println("True");
//         }
//         else
//         System.out.println("False");
//     }
// }