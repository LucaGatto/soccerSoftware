
public class TeamMatchesWon implements TeamStatistic{

	@Override
	public void showStat(Team team) {
		
		System.out.println("Match(es) Won By Team  " + team.getName() + " : "+  + team.getMatchesWon());
	}

}
