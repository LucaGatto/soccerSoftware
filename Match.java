
public class Match {
	
	private String arbiter; //nei tornei di calcetto solitamente l'arbitro è uno solo, non credo sia necessario, cosi come il costruttore che ne tiene conto 
	private Team team1;
	private Team team2;
	
	public Match(Team t1, Team t2,String a){
		
		this.team1 = t1;
		this.team2 = t2;
		this.arbiter = a;	
	}
	public Match(Team t1, Team t2){
		
		this(t1,t2,"");
	}
	
}
