package v2;

public class StatGoalScored implements IStatistic{

	private int goalScored = 0;
	
	@Override
	public void increaseStat() {
		// TODO Auto-generated method stub
		this.goalScored++;
	}

	@Override
	public void showStat() {
		// TODO Auto-generated method stub
		System.out.println("Goal scored: " + this.goalScored);
	}

}
