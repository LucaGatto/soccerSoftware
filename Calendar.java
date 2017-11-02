import java.util.*;

//percakotn kurl luhet quarte ,semi dhe finale dhe ndeshjet perkatese
public class Calendar {
	
	private List<Team> teams = new ArrayList();
	private List<Match> match = new ArrayList();
	private Elemination quarter = new Elemination(new Date());
	private Elemination semi = new Elemination(new Date());
	private Elemination finale = new Elemination(new Date());
	private Elemination currentRound;
	
	
	//kalendari ne fazen e pare paraqet ekipet e cerekfinales
	public Calendar(List<Team> teams,Date quarterDate,Date semiDate,Date finaleDate){
		
		this.setEleminationDate(this.quarter,quarterDate)
			.setEleminationDate(this.semi,semiDate)
			.setEleminationDate(this.finale,finaleDate);
		
		this.quarter.setMatches(teams);
		this.setCurrentRound(this.quarter);
		
	}
	//ne cfare date luhet nje round
	public Calendar setEleminationDate(Elemination e, Date date){
		
		e.setDate(date);
		return this;
	
	}
	
	public Calendar setCurrentRound(Elemination currentRound){
		
		this.currentRound = currentRound;
		return this;
		
		
	}
	public Elemination getCurrentRound(){
		
		return this.currentRound;
	}
	
	public Calendar setNextRound(Elemination currentRound){
		
		this.currentRound = currentRound;
		return this;
		
	}
	
}
