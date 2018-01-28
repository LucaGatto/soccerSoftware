package v2;
import java.util.ArrayList;
import java.util.List;

public class Matchweek {

	private List<Match> matches = new ArrayList<>();
	private String name;
	
	public Matchweek (String name, List<Match> matches){
		this.name = name;
		this.matches = matches;
	}
	
	public boolean endOfMatchweek() {
		boolean end = true;
		for(Match m : this.matches)
			if(!m.isEnded())
				end = false;
		return end;
	}
	
	public List<Team> getMatchweekWinners(){
		List<Team> winners = new ArrayList<>();
		for(Match m : this.matches)
			winners.add(m.getWinner());
		return winners;
	}
	
	public List<Team> getMatchweekLosers(){
		List<Team> losers = new ArrayList<>();
		for(Match m : this.matches)
			losers.add(m.getLoser());
		return losers;
	}
	
	public String getName(){
		return this.name;
	}
	
	public List<Match> getMatches(){
		return this.matches;
	}
	
	public String getResults() {
		String s = "";
		for(Match m : matches)
			s += m.getTeam1().getName() + " " + m.getResult() + " " + m.getTeam2().getName() + "\n";
		return s;
	}
	
}