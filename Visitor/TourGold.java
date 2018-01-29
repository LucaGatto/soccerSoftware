import java.util.*;

public class TourGold extends Tournament{
	
	protected int[] prizes = {5000 , 3000 , 1000};

	public TourGold(String name, List<Team> teams , boolean isGold, IMatchweekCreator mwc) {
		super(name, teams, isGold, mwc);
		
	}

	@Override
	public void accept(VisitTournament visitor) {
		
		visitor.printRanking(this);
	}

	@Override
	public void setPrizes(int[] prizes) {
		
		prizes = this.prizes;
	}

	@Override
	public int[] getPrizes() {
		// TODO Auto-generated method stub
		return this.prizes;
	}
	
}
