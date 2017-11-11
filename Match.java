public class Match {
	
	//private String arbiter; //nei tornei di calcetto solitamente l'arbitro è uno solo, non credo sia necessario, cosi come il costruttore che ne tiene conto 
	private Team team1;
	private Team team2;
	
	private int goalTeam1 = -1;
	private int goalTeam2 = -1;
	
	private String result = "match not played yet";
	
	/*public Match(Team t1, Team t2,String a){
		
		this.team1 = t1;
		this.team2 = t2;
		this.arbiter = a;	
	}*/
	public Match(Team t1, Team t2){
		
		this.team1 = t1;
		this.team2 = t2;
	}
	
	public void setResult(int gteam1, int gteam2) {
		this.goalTeam1 = gteam1;
		this.goalTeam2 = gteam2;
	}
	
	public String getResult() {
		return this.result;
	}
	
	public Team getTeam1() {
		return this.team1;
	}
	
	public Team getTeam2() {
		return this.team2;
	}
	
	public int getGoalTeam1() {
		return this.goalTeam1;
	}
	
	public int getGoalTeam2() {
		return this.goalTeam2;
	}
	
}