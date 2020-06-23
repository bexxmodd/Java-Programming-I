
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int played = 0;
        int win = 0;
        
        try (Scanner games = new Scanner(Paths.get(file))) {
            while (games.hasNextLine()) {
                String game = games.nextLine();
                String[] parts = game.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);
                
                if (team.equals(team1) || team.equals(team2)) {
                    played++;
                }
                
                if (team.equals(team1) && score1 > score2) {
                    win++;
                } else if (team.equals(team2) && score1 < score2) {
                    win++;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + played);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + (played - win));
    }

}
