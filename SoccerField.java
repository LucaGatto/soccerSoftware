import java.util.ArrayList;
import java.util.List;

public class SoccerField {

	private List<Tournament> tournaments = new ArrayList<>(); 
	private List<Player> players = new ArrayList<>();
	private List<Team> teams = new ArrayList<>();
	private List<PlayerCard> cards = new ArrayList<>();
	
	public SoccerField() {
		super();
	}
	
	public void newTournament(String name,List<Team> teams,int[] prizes,boolean isGold) {
		tournaments.add(new Tournament(name, teams, prizes, isGold));
	}
	
	public void newPlayer(String name, int age) {
		Player pl = new Player(name, age);
		players.add(pl);
		cards.add(new PlayerCard(pl));
	}
	
	public void newTeam(String name) {
		teams.add(new Team(name));
	}
	
	public void addPlayerToTeam(Player player, String nameTeam) {
		for(Team tm : teams) {
			if(tm.getName().equals(nameTeam))
				tm.addPlayer(player);
		}
	}
	
	public List<Team> getTeams(){
		return this.teams;
	}
	
	public void addMatchResultToTournament(String tournamentName,String matchweekName, String team1, String team2, int goalTeam1, int goalTeam2) {
		for(Tournament tr : tournaments) {
			if(tournamentName.equals(tr.getName())) {
				tr.addMatchResult(matchweekName, team1, team2, goalTeam1, goalTeam2);
			}
		}
	}
	
	public void showTournamentRanking(String tournamentName) {
		for(Tournament tr : tournaments) {
			if(tournamentName.equals(tr.getName())) {
				tr.showRanking();
			}
		}
	}

	public void getTournamentResults(String tournamentName,Matchweek m) {
		for(Tournament tr : tournaments) {
			if(tournamentName.equals(tr.getName())) {
				tr.getResults(m);
			}
		}
	}
	
	public void printTournamentMatchweekResults(String tournamentName,Matchweek m) { // modifica matchweek con string e metodo get matchweek
		String result = "";
		for(Tournament tr : tournaments) {
			if(tournamentName.equals(tr.getName())) {
				result = tr.getResults(m);
			}
		}
		System.out.println(result);
	}
	
	
	
	
	
	
}
