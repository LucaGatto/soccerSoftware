import java.util.*;

public class Calcetto {

	private List <Tournament> tours = new ArrayList();
	private List<Team> teams = new ArrayList();
	private List<Match> matches = new ArrayList();
	private List<Player> players = new ArrayList();
	
	private VisitTournament visitor;
	
	public Calcetto(){
		super();
	}

	public List<Tournament> getTours() {
		return tours;
	}

	public void setTours(List<Tournament> tours) {
		this.tours = tours;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	//get  statictics 
	
	/*public void accessStatistics(IStatistics s){
		s.ShowStatisctics();
	}*/
	
	public void printRanking(Tournament tour){
		
		tour.accept(new ShowRanking());
	}
	
}