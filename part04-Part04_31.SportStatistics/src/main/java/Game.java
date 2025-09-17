/**
 *
 * @author darhlilove
 */
public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;
    
    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getVisitingTeam(){
        return this.visitingTeam;
    }
    
    public String getWinner(){
        if (homeTeamPoints > visitingTeamPoints) {
            return this.homeTeam;
        }
        
        return this.visitingTeam;
    }
    
    public boolean isWinner(String team){
        if (team.equals(this.homeTeam) && this.homeTeamPoints > this.visitingTeamPoints) {
            return true;
        }
        
        if (team.equals(this.visitingTeam) && this.homeTeamPoints < this.visitingTeamPoints) {
            return true;
        }
        
        return false;
    }
}
