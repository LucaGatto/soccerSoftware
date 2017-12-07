
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoccerField sf = new SoccerField();
		sf.newTeam("Squadra1");
		sf.newTeam("Squadra2");
		sf.newTeam("Squadra3");
		sf.newTeam("Squadra4");
		sf.newTeam("Squadra5");
		sf.newTeam("Squadra6");
		sf.newTeam("Squadra7");
		sf.newTeam("Squadra8");
		
		int [] premi = new int[3];
		premi[0] = 2000;
		premi[1] = 1000;
		premi[2] = 500;
		
		sf.newTournament("TorneoTest", sf.getTeams(), premi, false);
		
		sf.addMatchResultToTournament("TorneoTest", "Quarterfinals", "Squadra1", "Squadra2", 2, 0);
		sf.addMatchResultToTournament("TorneoTest", "Quarterfinals", "Squadra3", "Squadra4", 2, 0);
		sf.addMatchResultToTournament("TorneoTest", "Quarterfinals", "Squadra5", "Squadra6", 2, 0);
		sf.addMatchResultToTournament("TorneoTest", "Quarterfinals", "Squadra7", "Squadra8", 2, 0);
		
		//sf.getTournamentResults("TorneoTest", "Quarterfinals");

		
	}

}
