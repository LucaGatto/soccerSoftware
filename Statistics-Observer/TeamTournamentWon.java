
public class TeamTournamentWon implements TeamStatistic{

	@Override
	public void showStat(Team team) {
		
		System.out.println("Tournament(s) Won By Team  " + team.getName() + " : "+ team.getTournamentsWon().size());
	}
}
