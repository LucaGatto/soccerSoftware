
public class PlayerStatistics implements IStatistics{

	private int matchesWon;
	private int goalsScored;
	private Player p;
	
	public PlayerStatistics(Player p){
		
		this.p = p;
		this.matchesWon = p.getPcard().getMatchesWon();
		this.goalsScored = p.getPcard().getGoalsScored();
	}
	@Override
	public void ShowStatisctics(){
		
		System.out.println(" Statistics of Player " + this.p.getName() + "  : Matches won = " + this.matchesWon + " ; Goals scored = " + this.goalsScored);
	}
}
