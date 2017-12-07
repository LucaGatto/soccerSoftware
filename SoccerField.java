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
	
	

}
