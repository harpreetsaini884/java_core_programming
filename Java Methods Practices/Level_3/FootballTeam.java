package Level_3;

import java.util.Random;

public class FootballTeam {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        
        // Generate random heights
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);  // height between 150 to 250 cms
        }
        
        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println("Mean Height: " + mean);
        System.out.println("Shortest Height: " + shortest);
        System.out.println("Tallest Height: " + tallest);
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int sum, int numberOfPlayers) {
        return sum / (double) numberOfPlayers;
    }

    public static int findShortest(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }

    public static int findTallest(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }
}
