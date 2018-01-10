package v2;

import java.util.ArrayList;
import java.util.List;

public class PlayerCard {

	private IStatistic goalScored;
	private IStatistic matchesPlayed;
	private IStatistic matchesWon;
	private String stateCard;
	
	public PlayerCard(IStatistic goalScored, IStatistic matchesPlayed, IStatistic matchesWon){
		this.goalScored = goalScored;
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.stateCard = "none"; 
		}
	
	public void showStatistic(IStatistic stat) {
		stat.showStat();
	}
	
	public IStatistic getGoalScored() {
		return goalScored;
	}

	public IStatistic getMatchesPlayed() {
		return matchesPlayed;
	}

	public IStatistic getMatchesWon() {
		return matchesWon;
	}

	public String getStateCard(){
		return this.stateCard;
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
}
