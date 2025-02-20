import java.util.Scanner;

class CompareStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String:");
        String str1 = sc.nextLine().toLowerCase();

        System.out.println("Enter second String:");
        String str2 = sc.nextLine().toLowerCase();

        boolean charAtComparison = newCharAt(str1, str2);
        boolean equalsComparison = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsComparison);

        if (charAtComparison == equalsComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods produce different results.");
        }

        sc.close();
    }

    public static boolean newCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }
}




// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         @SuppressWarnings("resource")
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first String");
//         String str1=sc.nextLine().toLowerCase();
//         System.out.println("Enter the second String");
//         String str2=sc.nextLine().toLowerCase();
//         newCharAt(str1, str2);

//         if(str1.equals(str2)){
//             System.out.println("Both are same");
//         }
//         else{
//             System.out.println("Both are different");
//         }

//     }
//     public static boolean newCharAt(String str1,String str2){
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         if(str1.length()==str2.length()){
//             for(int i=0;i<str1.length();i++){
//                 if(str1.charAt(i)!=str2.charAt(i)){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }