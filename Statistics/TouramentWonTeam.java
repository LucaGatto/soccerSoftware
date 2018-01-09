
public class TouramentWonTeam implements IStatistics {

	private Team team;
	
	public TouramentWonTeam(Team t){
		
		this.team = t;
	}
	
	
	@Override
	public void ShowStatisctics() {
		
		System.out.println("Statistics of  " + this.team.getName()  + " ; Tournaments Won = " + this.team.getTournamentsWon().size());
		
	}

}
