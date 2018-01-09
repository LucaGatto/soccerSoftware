import java.util.ArrayList;
import java.util.List;

public class TeamStatistics implements IStatistics{

	private Team team;
	private int matchesWon;
	private List<Tournament> tournamentsWon = new ArrayList<>();
	
	
	public TeamStatistics(Team t){
		
		this.team = t;
		this.matchesWon = t.getMatchesWon();
		this.tournamentsWon = t.getTournamentsWon();
		
	}
	
	public void ShowStatisctics() {
		
		System.out.println("Statistics of  " + team.getName() + " : MatchesWon = " + this.matchesWon + " ; Tournaments Won = " + this.tournamentsWon);
		
	}

}
