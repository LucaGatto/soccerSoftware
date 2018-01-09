
import java.util.ArrayList;
import java.util.List;

public class Team {

	private List<Player> team = new ArrayList<>();
	private String name;
	
	private int matchWon = 0; 
	private List<Tournament> tournamentsWon = new ArrayList<>();
	
	public Team(String name){
		this.name = name;
	}
	
	//get methods
	
	protected String getName(){
		return this.name;
	}
	
	public List<Player> getPlayers(){
		return this.team;
	}
	
	public List<Tournament> getTournamentsWon(){
		return this.tournamentsWon;
	}
	
	//----
	
	public void addPlayer(Player player){
		this.team.add(player);
	}
	
	private void removePlayer(Player player){
		this.team.remove(player);
	}
	
	public void addTournamentWon(Tournament t){
		this.tournamentsWon.add(t);
	}
	
	public void addMatchWon() {
		this.matchWon++;
		for(Player p : team) {
			p.getPcard().addMatchWon();
		}
	}
	
	public int getMatchesWon() {
		return this.matchWon;
	}
	
}
