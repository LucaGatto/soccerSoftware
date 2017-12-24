public class Match {
	
	private Team team1;
	private Team team2;
	
	private int goalTeam1 = -1;
	private int goalTeam2 = -1;
	
	private String result = "match not played yet";
	
	public Match(Team t1, Team t2){
		
		this.team1 = t1;
		this.team2 = t2;
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
	
	public void endMatch(){
		
		if(this.getGoalTeam1() > this.getGoalTeam2()){
			
			this.getTeam1().addMatchWon();
			
		}
		else if(this.getGoalTeam1() < this.getGoalTeam2()){
			
			this.getTeam2().addMatchWon();
		}
	}
	public void addGoal(Team t ,Player p){
		
		if(t.equals(team1)){
			if(this.goalTeam1 == -1)
				this.goalTeam1 = 1;
			else
				this.goalTeam1 ++;
		}		
		else if(t.equals(team2)){
			if(this.goalTeam2 == -1)
				this.goalTeam2 = 1;
			else
				this.goalTeam2 ++;
		}
		p.addGoalScored();
	}

}