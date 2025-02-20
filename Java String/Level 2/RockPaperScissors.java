import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userWins = 0, computerWins = 0, totalGames = 0;

        System.out.print("Enter number of games to play: ");
        int games = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < games; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            totalGames++;
        }

        scanner.close();
        double userWinPercent = (userWins * 100.0) / totalGames;
        double computerWinPercent = (computerWins * 100.0) / totalGames;

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins + " (" + userWinPercent + "%)");
        System.out.println("Computer Wins: " + computerWins + " (" + computerWinPercent + "%)");
    }
}
