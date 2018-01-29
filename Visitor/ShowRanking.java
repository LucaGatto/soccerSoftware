
public class ShowRanking implements VisitTournament{

	@Override
	public void printRanking(TourGold gold) {
		
		System.out.println("Ranking of Gold Tournament : ");
		gold.showRanking();
		
	}

	@Override
	public void printRanking(TourNormal norm) {
		
		System.out.println("Ranking of Normal Tournament : ");
		
		norm.showRanking();
		
	}

}
