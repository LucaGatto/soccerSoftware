package v2;

public class StatMatchesWon implements IStatistic{

	private int matchesWon = 0;
	
	@Override
	public void increaseStat() {
		// TODO Auto-generated method stub
		this.matchesWon++;
	}

	@Override
	public void showStat() {
		// TODO Auto-generated method stub
		System.out.println("Matches won: " + this.matchesWon);
	}

}
