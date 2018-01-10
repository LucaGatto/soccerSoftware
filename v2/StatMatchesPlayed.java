package v2;

public class StatMatchesPlayed implements IStatistic{

	private int matchPlayed = 0;
	
	@Override
	public void increaseStat() {
		// TODO Auto-generated method stub
		this.matchPlayed++ ;
	}

	@Override
	public void showStat() {
		// TODO Auto-generated method stub
		System.out.println("Matches played: " + this.matchPlayed);
	}

	
	
}
