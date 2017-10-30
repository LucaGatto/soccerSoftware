public class PlayerCard {

	private Player player;
	private int matchPlayed;
	private int goalsScored;
	private String stateCard;//yellow or red cards
	
	private PlayerCard(Player player){
		this.player = player;
		this.matchPlayed = 0;
		this.goalsScored = 0;
		this.stateCard = "none"; //otherw. use of 2 different boolean for yllw and red card
	}
	
	//get methods
	
	private Player getPlayer(){
		return this.player;
	}
	
	private int getMatchPlayed(){
		return this.matchPlayed;
	}
	
	private int getGoalsScored(){
		return this.goalsScored;
	}
	
	private String getStateCard(){
		return this.stateCard;
	}
	
	//set methods
	
	private void setMatchPlayed(int num){
		this.matchPlayed = num;
	}
	
	private void setGoalsScored(int num){
		this.goalsScored = num;
	}
	
	private void setYellowStateCard(){
		this.stateCard = "Yellow";
	}
	
	private void setRedStateCard(){
		this.stateCard = "Red";
	}
}
