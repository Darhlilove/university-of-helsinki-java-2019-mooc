
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// First implementation
//public class SportStatistics {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("File:");
//        String file = scanner.nextLine();
//
//        System.out.println("Team:");
//        String team = scanner.nextLine();
//
//        try {
//            Scanner fileScanner = new Scanner(Paths.get(file));
//
//            int numberOfGames = 0;
//            int wins = 0;
//
//            while (fileScanner.hasNextLine()) {
//                String line = fileScanner.nextLine();
//
//                String[] parts = line.split(",");
//
//                String homeTeam = parts[0];
//                String visitingTeam = parts[1];
//                int homeTeamPoint = Integer.valueOf(parts[2]);
//                int visitingTeamPoint = Integer.valueOf(parts[3]);
//
//                if (team.equals(homeTeam) || team.equals(visitingTeam)) {
//                    numberOfGames++;
//
//                    boolean isHomeTeam = team.equals(homeTeam);
//
//                    if (isHomeTeam && homeTeamPoint > visitingTeamPoint
//                            || !isHomeTeam && homeTeamPoint < visitingTeamPoint) {
//                        wins++;
//                        continue;
//                    }
//                }
//            }
//
//            System.out.println("Games: " + numberOfGames);
//            System.out.println("Wins: " + wins);
//            System.out.println("Losses: " + (numberOfGames - wins));
//        } catch (Exception e) {
//            System.out.println("Reading the file " + file + " failed!");
//        }
//    }
//
//}
public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();

        System.out.println("Team:");
        String team = scanner.nextLine();
        
        ArrayList<Game> games = readGamesFromFile(file);

        int numberOfGames = 0;
        int wins = 0;
        
        for(Game game : games){
            if (team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())) {
                numberOfGames++;
                
                // Option 1: using getWinner method
                if (team.equals(game.getWinner())) {
                    wins++;
                }
                
                // Option 2: using isWinner method
//                if (game.isWinner(team)) {
//                    wins++;
//                }
            }
        }
        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (numberOfGames - wins));

    }

    public static ArrayList<Game> readGamesFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(Paths.get(file));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                if (line.isBlank()) {
                    continue;
                }

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                
                int homeTeamPoint = Integer.valueOf(parts[2]);
                int visitingTeamPoint = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, visitingTeam, homeTeamPoint, visitingTeamPoint));
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed!");
        }

        return games;
    }
}
