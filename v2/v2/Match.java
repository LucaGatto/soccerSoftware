package v2;

public class Match {
	
	private Team team1;
	private Team team2;
	
	private int goalTeam1;
	private int goalTeam2;
	
	private String result = "match not ended yet";
	
	private boolean ended;
	
	public Match(Team t1, Team t2){
		
		this.team1 = t1;
		this.team2 = t2;
		
		this.goalTeam1 = 0;
		this.goalTeam2 = 0;
		this.ended = false;
	}
	
	public void addGoal(Team t ,Player p){
		
		if(t.equals(team1))
			this.goalTeam1 ++;
		
		else if(t.equals(team2))
			this.goalTeam2 ++;

		p.addGoalScored();
	}
	
	public void endMatch() { 
		this.ended = true;
		
		this.result = this.goalTeam1 + " : " + this.goalTeam2;
		
		if(this.goalTeam1 > this.goalTeam2)
			this.team1.updateStats();
		
		else if(this.goalTeam1 < this.goalTeam2)
			this.team2.updateStats();
	}
	
	public Team getWinner() {
		if(this.goalTeam1 > this.goalTeam2)
			return this.team1;
		
		else
			return this.team2;
	}
	
	public Team getLoser() {
		if(this.goalTeam1 > this.goalTeam2)
			return this.team2;
		
		else
			return this.team1;
	}
	
	public void setResult(int gteam1, int gteam2) {
		this.goalTeam1 = gteam1;
		this.goalTeam2 = gteam2;
		this.result = this.goalTeam1 + " : " + this.goalTeam2;
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

	public boolean isEnded() {
		return ended;
	}

}