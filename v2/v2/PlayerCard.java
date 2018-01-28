package v2;

import java.util.ArrayList;
import java.util.List;

public class PlayerCard {

	private List<IStatistic> stats = new ArrayList<>();
	
	public PlayerCard(){
		
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

	public List<IStatistic> getStats() {
		return stats;
	}

	public void setStats(List<IStatistic> stats) {
		this.stats = stats;
	}
	
}