import java.util.ArrayList;
import java.util.List;

public class MatchesWonTeam   implements IStatistics {

	private Team team;
	
	public MatchesWonTeam(Team t){
		
		this.team = t;
	}
	
	
	@Override
	public void ShowStatisctics() {
		
		System.out.println("Statistics of  " + this.team.getName()  + " ; Matches Won = " + this.team.getMatchesWon());
		
	}
}
