import java.util.ArrayList;
import java.util.List;

public class Team {

	private List<Player> team = new ArrayList<>();
	private String name;
	
	private List<Tournament> tournamentsWon = new ArrayList<>();
	
	public Team(String name){
		this.name = name;
	}
	
	//get methods
	
	protected String getName(){
		return this.name;
	}
	
	private List<Player> getPlayers(){
		return this.team;
	}
	
	private List<Tournament> getTournamentsWon(){
		return this.tournamentsWon;
	}
	
	//----
	
	private void addPlayer(Player player){
		this.team.add(player);
	}
	
	private void removePlayer(Player player){
		this.team.remove(player);
	}
	
	private void addTournamentWon(Tournament t){
		this.tournamentsWon.add(t);
	}
	
}
