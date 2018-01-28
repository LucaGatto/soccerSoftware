package v2;
import java.util.ArrayList;
import java.util.List;

public class Team {

	private String name;
	private List<Player> team = new ArrayList<>();
	private List<IStatistic> stats = new ArrayList<>();
	
	public Team(String name){
		this.name = name;
	}
	
	public void addStat(IStatistic st) {
		this.stats.add(st);
	}
	
	public void updateStats() {
		for(IStatistic s : this.stats)
			s.increaseStat();
	}
	
	public void showStats() {
		for(IStatistic s : this.stats)
			s.showStat();
	}
	
	public void addPlayer(Player player){
		this.team.add(player);
	}
	
	private void removePlayer(Player player){
		this.team.remove(player);
	}
	
	//get methods
	
	public List<IStatistic> getStats(){
		return this.stats;
	}
	
	protected String getName(){
		return this.name;
	}
	
	public List<Player> getPlayers(){
		return this.team;
	}

	public void setStats(List<IStatistic> stats) {
		this.stats = stats;
	}
	
}
