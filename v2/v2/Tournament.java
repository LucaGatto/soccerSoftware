package v2;
import java.util.ArrayList;
import java.util.List;

public class Tournament {

	private String name;
	private List<Team> teams = new ArrayList<>();
	private List<Matchweek> matchweek = new ArrayList<>();
	
	private String[] winners = new String[3];
	private int[] prizes = new int[3];
	private boolean endOfTournament = false;
	
	private boolean isGold;
	
	private IMatchweekCreator mwc;
	
	public Tournament(String name,List<Team> teams,int[] prizes,boolean isGold, IMatchweekCreator mwc){
		this.name = name;
		this.teams = teams;
		this.prizes = prizes;
		this.isGold = isGold;
		this.mwc = mwc;
		this.matchweek.add(mwc.createMatchweek(teams, "Quarterfinals")); 
	}
	
	private void addMatchweek(String name,List<Team> teams){
		this.matchweek.add(this.mwc.createMatchweek(teams, name));
	}
	
	public void addGoal(Match m, Team t, Player p) {
		m.addGoal(t, p);
	}
	
	public void endMatch(Matchweek mw, Match m) {
		m.endMatch();
		if(mw.endOfMatchweek())
			this.matchweekEndingOperations(mw);
	}
	
	private void matchweekEndingOperations(Matchweek mw) {
		List<Team> winnersTeams = mw.getMatchweekWinners();
		List<Team> losersTeams = mw.getMatchweekLosers();
		
		if(mw.getName().equals("Quarterfinals"))
			addMatchweek("Semifinals", winnersTeams);
		
		else if(mw.getName().equals("Semifinals")) {
			addMatchweek("Final", winnersTeams);
			addMatchweek("Final 3rd place", losersTeams);
		}
		
		else if(mw.getName().equals("Final")) {
			Team winner = winnersTeams.get(0);
			
			winners[0] = winner.getName();
			winners[1] = losersTeams.get(0).getName();
			
			if(winners[2] != null)
				endOfTournament = true;
		}
		else if(mw.getName().equals("Final 3rd place")) {
			winners[2] = winnersTeams.get(0).getName();
			if(winners[0] != null)
				endOfTournament = true;
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
	
	public void showRanking() {
		if(endOfTournament) {
			System.out.println("POS \t TEAM \t PRIZE");
			for(int i=0; i < winners.length;i++) {
				System.out.println((i + 1) + "\t" + winners[i] + "\t" + prizes[i]);
			}
		}
		else
			System.out.println("The tournament isn't finished yet");
	}
	
	public List<Match> getMatchweekMatches(Matchweek mw){
		return mw.getMatches();
	}
	
	//---GETTERS AND SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public List<Matchweek> getMatchweek() {
		return matchweek;
	}

	public void setMatchweek(List<Matchweek> matchweek) {
		this.matchweek = matchweek;
	}

	public IMatchweekCreator getMwc() {
		return mwc;
	}

	public void setMwc(IMatchweekCreator mwc) {
		this.mwc = mwc;
	}

}
