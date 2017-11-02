import java.util.ArrayList;
import java.util.List;

public class Tournament {

	private String name;
	private List<Team> teams = new ArrayList<>();
	private List<Match> matches = new ArrayList<>();
	private List<Matchweek> matchweek = new ArrayList<>();
	
	private int[3] prizes;
	
	private boolean isGold;
	/*private String results;
	private String quarter;
	private String semi;
	private String finalMatch;
	*/
	
	public Tournament(String name,List<Team> teams,int[3] prizes,boolean isGold,String nameMatchweek){
		this.name = name;
		this.teams = teams;
		
		this.prizes = prizes;
		
		this.isGold = isGold;
		
		for(int i = 0; i < teams.size();i++){
			
			this.matches.add(new Match(teams.get(i),teams.get(i+1)));
			++i;
		}
		
		this.matchweek.add(new Matchweek(nameMatchweek, this.matches)); 
	}
	
	private void addMatchweek(String name,List<Team> teams){
		
		for(int i = 0; i < teams.size();i++){
			
			this.matches.add(new Match(teams.get(i),teams.get(i+1)));
			++i;
		}
		this.matchweek.add(new Matchweek("First matchweek", this.matches));
		
	}
	
	private String getMatchweekName(Matchweek mw){
		return mw.getName();
	}
	
	private List<Match> getMatchweekMatches(Matchweek mw){
		return mw.getMatches();
	}
	
	public void showRanking(List<Team> winners) {
		
		for(int i=0; i < winners.size();i++) {
			System.out.println((i + 1) + "\t" + winners.get(i) + "\t" + prizes[i]);
		}
	}
	
}
