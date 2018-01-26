
public class PlyaerGoalScoredStrategy implements PlayerStatistics{

	@Override
	public void showStat(PlayerCard card) {
		
		System.out.println("Goal(s) scored : " + card.getGoalsScored());
		
	}
}
