
public class MatchesWonPlayer implements IStatistics{

	private Player p;
	
	
	
	public MatchesWonPlayer(Player p){
		
		this.p = p;
	}
	
	
	@Override
	public void ShowStatisctics() {
		
		System.out.println(" Statistics of Player " +  p.getName() +  " ; Matches Won = " + p.getPcard().getMatchesWon());
		
	}
}
