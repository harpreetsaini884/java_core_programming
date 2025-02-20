import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        
        String charAtSubstring = createSubstringUsingCharAt(inputString, start, end);
        String builtInSubstring = inputString.substring(start, end);

        
        boolean comparisonResult = compareStringsUsingCharAt(charAtSubstring, builtInSubstring);

        
        System.out.println("\nSubstring using charAt(): " + charAtSubstring);
        System.out.println("Substring using built-in substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + comparisonResult);

        sc.close();
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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




// import java.util.*;
// public class CompareSubStr {
//     Scanner sc=new Scanner(System.in);
//     String str=sc.nextLine();
//     int start=sc.nextInt();
//     int end=sc.nextInt();

    
//     public static boolean comparetwoString(String str,String str2){
//         if(str.length()!=str2.length()){
//             return false;

//         }
//         for(int i=0;i<str.length();i++){
//             if(str.length()!=str2.length()){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static String createsubString(String str,int start,int end){
//         StringBuilder sb=new StringBuilder();
//         for(int i=start;i<end;i++){
//             sb.append(str.charAt(i));
//         }
//         return sb.toString();
//     }
// }
