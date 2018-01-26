import java.util.*;

public class PlayerCard {

	private int matchPlayed;
	private int goalsScored;
	private String stateCard;//yellow or red cards 
	
	private List<ObservePlayerCard>observers = new ArrayList();
	
	//private IStatistics statistics;
	private PlayerStatistics statictic;
	
	private int matchesWon;
	
	public PlayerCard(){
		
		this.matchPlayed = 0;
		this.goalsScored = 0;
		this.stateCard = "none"; //otherw. use of 2 different boolean for yllw and red card
		
		this.matchesWon = 0;
	}
	
	/*public void  getStatistics() { 
		
		
		if(this.statistics instanceof GoalScoredStatistic){
			
			this.statistics.ShowStatisctics(this.goalsScored); 
		}
		else if(this.statistics instanceof MatchesWon){ 
			
			this.statistics.ShowStatisctics(this.matchesWon); 
		}
		
	}

	public void setStatisctics(IStatistics s) {
		this.statistics = s;
	} */
	//get methods
	
	
	//show statisctics
	public void showStatistic(PlayerStatistics statictic){
		
		statictic.showStat(this);
	}
	public PlayerStatistics getStatictic() {
		return this.statictic;
	}

	public void setStatictic(PlayerStatistics statictic) {
		this.statictic = statictic;
	}
	

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
		this.nottifyObservers();
	}
	//ObserverStart
		public List<ObservePlayerCard> getObservers() {
			return observers;
		}

		public void setObservers(List<ObservePlayerCard> observers) {
			this.observers = observers;
		}
		public void registerObserver(ObservePlayerCard newObserver){
			
			this.observers.add(newObserver);
			
		}
		public void nottifyObservers(){//invoked at addGoalScored() 
			
			for(ObservePlayerCard obs : this.observers){
				obs.update();
			}
		}
		//Observer end
	
	public void addMatchWon(){
		this.matchesWon++;
	}
}
