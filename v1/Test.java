package v1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Mario", 25); // creo giocatori
		Player p2 = new Player("Mario", 25);
		Player p3 = new Player("Piero", 25);
		Player p4 = new Player("Mario", 25);
		Player p5 = new Player("Luigi", 25);
		Player p6 = new Player("Mario", 25);
		Player p7 = new Player("Luca", 25);
		Player p8 = new Player("Mario", 25);
		
		Team t1 = new Team("Squadra1"); // creo squadre
		Team t2 = new Team("Squadra2");
		Team t3 = new Team("Squadra3");
		Team t4 = new Team("Squadra4");
		Team t5 = new Team("Squadra5");
		Team t6 = new Team("Squadra6");
		Team t7 = new Team("Squadra7");
		Team t8 = new Team("Squadra8");
		
		t1.addPlayer(p1); //aggiungo giocatori a squadre
		t2.addPlayer(p2);
		t3.addPlayer(p3);
		t4.addPlayer(p4);
		t5.addPlayer(p5);
		t6.addPlayer(p6);
		t7.addPlayer(p7);
		t8.addPlayer(p8);
		
		List<Team> team = new ArrayList<>(); // lista da inserire nel torneo
		team.add(t1);
		team.add(t2);
		team.add(t3);
		team.add(t4);
		team.add(t5);
		team.add(t6);
		team.add(t7);
		team.add(t8);
		
		int [] premi = new int[3]; //premi per i primi 3 classificati
		premi[0] = 2000;
		premi[1] = 1000;
		premi[2] = 500;
		
		Tournament trn = new Tournament("TorneoTest", team, premi, false, new SimpleMatchweekCreator()); //simplMatcCreator si occupa della creazione di tutte le matchweek (Strategy)
		
		List<Matchweek> mw = trn.getMatchweek(); //mi servono i riferimenti a matchweek e match
		Matchweek quarter = mw.get(0); 
		
		List<Match> matches = quarter.getMatches();
		
		Match m0 = matches.get(0);
		Match m1 = matches.get(1);
		Match m2 = matches.get(2);
		Match m3 = matches.get(3);
		
		
		trn.addGoal(m0, t1, p1); //nel match m0 la squadra t1 ha segnato 1 gol con il player p1
		trn.addGoal(m1, t3, p3); // per comodità faccio finire tutte 1 - 0
		trn.addGoal(m2, t5, p5);
		trn.addGoal(m3, t7, p7);
		
		trn.endMatch(quarter, m0); //devo segnalare quando una partita è terminata
		trn.endMatch(quarter, m1);
		trn.endMatch(quarter, m2);
		trn.endMatch(quarter, m3); //con la fine dell'ultimo match della matchweek, il metodo in automatico crea la prossima matchweek e la aggiunge alla lista del torneo

		trn.getMatchweekResults("Quarterfinals"); //stampa risultati
		trn.getTournamentResults();
		
		Matchweek semi = trn.getMatchweek().get(1); //semifinal
		Match m4 = semi.getMatches().get(0); 
		Match m5 = semi.getMatches().get(1);
		
		trn.addGoal(m4, t1, p1);
		trn.addGoal(m5, t5, p5);
		
		trn.endMatch(semi, m4);
		trn.endMatch(semi, m5);
		
		trn.getMatchweekResults("Semifinals");
		trn.getTournamentResults();
		
		Matchweek fin = trn.getMatchweek().get(2);
		Matchweek fin3pl = trn.getMatchweek().get(3);
		Match m6 = fin.getMatches().get(0);
		Match m7 = fin3pl.getMatches().get(0);
		
		trn.addGoal(m6, t1, p1);
		trn.addGoal(m7, t3, p3);
		
		trn.endMatch(fin, m6);
		trn.showRanking(); //The tournament isn't finished yet (manca final 3 place)
		trn.endMatch(fin3pl, m7);
	
		trn.getTournamentResults();
		trn.showRanking();//stampa classifica vincitori premi
	
	
	
	}

}
