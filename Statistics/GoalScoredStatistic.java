
public class GoalScoredStatistic implements IStatistics{

	private Player p;
	private int goalScored;
	
	
	public GoalScoredStatistic(Player p){
		
		this.p = p;
	}
	
	
	@Override
	public void ShowStatisctics() {
		
		System.out.println(" Statistics of Player " +  p.getName() +  " ; Goals scored = " + p.getPcard().getGoalsScored());
		
	}
	
	

}