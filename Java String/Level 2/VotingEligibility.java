import java.util.Random;

public class VotingEligibility {
    public static int[] generateAges(int count) {
        Random rand = new Random();
        int[] ages = new int[count];

        for (int i = 0; i < count; i++) {
            ages[i] = rand.nextInt(82) + 10; 
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] eligibility = checkVotingEligibility(ages);

        System.out.println("Age\tEligibility");
        for (String[] row : eligibility) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
