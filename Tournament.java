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
	
	public Tournament(String name,List<Team> teams,int[] prizes,boolean isGold){
		this.name = name;
		this.teams = teams;
		
		this.prizes = prizes;
		
		this.isGold = isGold;
		
		for(int i = 0; i < teams.size();i = i + 2){
			
			this.matches.add(new Match(teams.get(i),teams.get(i+1)));
		}
		
		this.matchweek.add(new Matchweek("Quarterfinals", this.matches)); 
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addMatchweek(String name,List<Team> teams){
		
		List<Match> temp = new ArrayList<>();
		
		for(int i = 0; i < teams.size();i++){
			
			temp.add(new Match(teams.get(i),teams.get(i+1)));
			++i;
		}
		this.matchweek.add(new Matchweek(name, temp));
		
	}
	
	private String getMatchweekName(Matchweek mw){
		return mw.getName();
	}
	
	public List<Match> getMatchweekMatches(Matchweek mw){
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
	
	public String getResults(Matchweek m) {
		results = "";
		results += m.getName() + "\n" + m.getResults();
		return results;
	}
	
	public List<Matchweek> getMatchweek() {
		return this.matchweek;
	}
	
	public void addMatchResult(String matchweekName, String team1, String team2, int goalTeam1, int goalTeam2) {
		List<Matchweek> temporaryList = new ArrayList<>();
		for(int i= 0 ; i < matchweek.size(); i++){
			temporaryList.add(matchweek.get(i));
		}
		for (Matchweek m : temporaryList) {
			if(m.getName().equals(matchweekName)) {
				boolean endOfMatchweek = true;
				for (Match mt : m.getMatches()) {
					if(mt.getTeam1().getName().equals(team1) && mt.getTeam2().getName().equals(team2)) {
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
	
	public void getTournamentResults() {
		for (Matchweek mw : this.getMatchweek()) {
				System.out.println(mw.getName());	
				System.out.println(mw.getResults());
				System.out.println();
				}
	}
	
	public void getMatchweekResults(String matchweekName) {
		String result = "";
		for(Matchweek m : this.getMatchweek()) {
			if(m.getName().equals(matchweekName))
			result = m.getResults();
		}
		System.out.println(result);
	}
	
	
	
	
	
	
}
