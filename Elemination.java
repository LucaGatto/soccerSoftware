import java.util.*;
public class Elemination {
	
	//round -->which is the round final,semifinal,quarter
	private String round;
	private Date date;
	private List<Match> matches = new ArrayList();
	
	
	public Elemination(Date date){
		
		this.date = date;
		
	}
	
	public Elemination setDate(Date date){
		
		this.date = date;
		return this;
	}
	public Date getDate(){
		
		return this.date;
	}
	
	public Elemination setMatches(List<Team> teams){
		
		for(int i = 0; i < teams.size(); i++){
			
			matches.add(new Match(teams.get(i),teams.get(i+1)));
			
			++i;
		}
		return this;
		
	}
	
	public List<Match> getMatches(){
		
		return this.matches;
	}
	
	public Elemination setRound(String round){
		
		this.round = round;
		return this;
	}
	public String getRound(){
		
		return this.round;
	}
	
	//public Date addMatch(){}
}