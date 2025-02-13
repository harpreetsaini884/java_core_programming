import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter age of Amar: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        double anthonyHeight = sc.nextDouble();

        
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngestFriend = "";

        if (amarAge == youngestAge) {
            youngestFriend = "Amar";
        } else if (akbarAge == youngestAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallestFriend = "";

        if (amarHeight == tallestHeight) {
            tallestFriend = "Amar";
        } else if (akbarHeight == tallestHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}
