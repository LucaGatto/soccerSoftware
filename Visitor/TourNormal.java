import java.util.*;

public class TourNormal extends Tournament{

	protected int[] prizes = {3000 , 1000 , 500};
	
	public TourNormal(String name, List<Team> teams, boolean isGold, IMatchweekCreator mwc) {
		super(name, teams,  isGold, mwc);
	
		// TODO Auto-generated constructor stub
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
