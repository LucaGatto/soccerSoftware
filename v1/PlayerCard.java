package v1;
public class PlayerCard {

	private int matchPlayed;
	private int goalsScored;
	private String stateCard;//yellow or red cards
	
	private int matchesWon;
	
	public PlayerCard(){
		this.matchPlayed = 0;
		this.goalsScored = 0;
		this.stateCard = "none"; //otherw. use of 2 different boolean for yllw and red card
		
		this.matchesWon = 0;
	}
	
	//get methods
	
	public int getMatchPlayed(){
		return this.matchPlayed;
	}
	
	public int getGoalsScored(){
		return this.goalsScored;
	}
	
	public String getStateCard(){
		return this.stateCard;
	}
	
	public int getMatchesWon(){
		return this.matchesWon;
	}
	
	//set methods
	
	public void setMatchPlayed(int num){
		this.matchPlayed = num;
	}
	
	public void setGoalsScored(int num){
		this.goalsScored = num;
	}
	
	public void setNoneStateCard(){
		this.stateCard = "none";
	}
	
	public void setYellowStateCard(){
		this.stateCard = "Yellow";
	}
	
	public void setRedStateCard(){
		this.stateCard = "Red";
	}
	// ---
	
	public void addGoalScored(){
		this.goalsScored++;
	}
	
	public void addMatchWon(){
		this.matchesWon++;
	}
}
