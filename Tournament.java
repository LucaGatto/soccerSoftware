import java.util.ArrayList;
import java.util.List;

public class Tournament {

	private String name;
	private List<Team> teams = new ArrayList<>();
	private List<Match> matches = new ArrayList<>();
	private List<Matchweek> matchweek = new ArrayList<>();
	
	private Team[] winners = new Team[3];
	private int[] prizes = new int[3];
	private boolean endOfTournament = false;
	
	private boolean isGold;
	private String results = "";
	
	/*private String quarter;
	private String semi;
	private String finalMatch;
	*/
	
	public Tournament(String name,List<Team> teams,int[] prizes,boolean isGold){
		this.name = name;
		this.teams = teams;
		
		this.prizes = prizes;
		
		this.isGold = isGold;
		
		for(int i = 0; i < teams.size();i++){
			
			this.matches.add(new Match(teams.get(i),teams.get(i+1)));
			++i;
		}
		
		this.matchweek.add(new Matchweek("Quarterfinals", this.matches)); 
	}
	
	private void addMatchweek(String name,List<Team> teams){
		
		for(int i = 0; i < teams.size();i++){
			
			this.matches.add(new Match(teams.get(i),teams.get(i+1)));
			++i;
		}
		this.matchweek.add(new Matchweek(name, this.matches));
		
	}
	
	private String getMatchweekName(Matchweek mw){
		return mw.getName();
	}
	
	private List<Match> getMatchweekMatches(Matchweek mw){
		return mw.getMatches();
	}
	
	public void showRanking() {
		if(endOfTournament) {
			for(int i=0; i < winners.length;i++) {
				System.out.println((i + 1) + "\t" + winners[i] + "\t" + prizes[i]);
			}
		}
		else
			System.out.println("The tournament isn't finished yet");
	}
	
	public void getResults(Matchweek m) {
		results += m.getName() + "\n" + m.getResults();
	}
	
	public void addMatchResult(String matchweekName, String team1, String team2, int goalTeam1, int goalTeam2) {
		for (Matchweek m : matchweek) {
			if(m.getName().equals(matchweekName)) {
				boolean endOfMatchweek = true;
				for (Match mt : m.getMatches()) {
					if(mt.getTeam1().equals(team1) && mt.getTeam2().equals(team2)) {
						mt.setResult(goalTeam1, goalTeam2);
					}
					if(mt.getGoalTeam1() < 0 && mt.getGoalTeam2() < 0) {
						endOfMatchweek = false;
					}
				}
				if(endOfMatchweek) {
					List<Team> teamNextMw = new ArrayList<>();
					List<Team> teamLosers = new ArrayList<>();
					for (Match mt : m.getMatches()) {
						if(mt.getGoalTeam1() > mt.getGoalTeam2()) {
							teamNextMw.add(mt.getTeam1());
							teamLosers.add(mt.getTeam2());
							mt.getTeam1().addMatchWon();
						}
						else {
							teamNextMw.add(mt.getTeam2());
							teamLosers.add(mt.getTeam1());
							mt.getTeam2().addMatchWon();
						}
					}
					if(m.getName().equals("Quarterfinals"))
						addMatchweek("Semifinals", teamNextMw);
					else if(m.getName().equals("Semifinals")) {
						addMatchweek("Final", teamNextMw);
						addMatchweek("Final 3rd place", teamLosers);
					}
					else if(m.getName().equals("Final")) {
						Team winner = teamNextMw.get(0);
						winner.addTournamentWon(this);
						winners[1] = winner;
						winners[2] = teamLosers.get(0);
						if(winners[3] != null)
							endOfTournament = true;
							
					}
					else if(m.getName().equals("Final 3rd place")) {
						winners[3] = teamNextMw.get(0);
						if(winners[1] != null)
							endOfTournament = true;
					}
				}
			}
		}		
	}
}
