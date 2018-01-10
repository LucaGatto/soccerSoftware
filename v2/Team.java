package v2;
import java.util.ArrayList;
import java.util.List;

public class Team {

	private List<Player> team = new ArrayList<>();
	private String name;
	
	private IStatistic matchesWon; 
	private IStatistic tournamentsWon;
	
	public Team(String name, IStatistic matchesWon, IStatistic tournamentsWon){
		this.name = name;
		this.matchesWon = matchesWon;
		this.tournamentsWon = tournamentsWon;
	}
	
	public void addPlayer(Player player){
		this.team.add(player);
	}
	
	public void removePlayer(Player player){
		this.team.remove(player);
	}

	public void showStat(IStatistic stat) {
		stat.showStat();
	}
	
	public IStatistic getMatchesWon() {
		return matchesWon;
	}

	public IStatistic getTournamentsWon() {
		return tournamentsWon;
	}
	
	public String getName(){
		return this.name;
	}
	
	public List<Player> getPlayers(){
		return this.team;
	}
}
