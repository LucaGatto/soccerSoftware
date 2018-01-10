package v2;

public class StatTournamentsWon implements IStatistic{
	
	private int tournamentsWon = 0;

	@Override
	public void increaseStat() {
		// TODO Auto-generated method stub
		this.tournamentsWon++;
	}

	@Override
	public void showStat() {
		// TODO Auto-generated method stub
		System.out.println("Tournaments won: " + this.tournamentsWon);
	}
	
	

}
