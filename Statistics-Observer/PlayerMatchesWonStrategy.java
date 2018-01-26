
public class PlayerMatchesWonStrategy implements PlayerStatistics{

	@Override
	public void showStat(PlayerCard card) {
		
		System.out.println("Match(es) Won : " + card.getMatchesWon());
		
	}

}
