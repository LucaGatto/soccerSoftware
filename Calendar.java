import java.util.*;

public class Calendar {
	
	private List<Team> teams = new ArrayList();
	private Date quarterDate = new Date();	
	private Date semifinalsDate;
	private Date finalDate;
	
	
	
	public Calendar(Date quarterDate ,Date semifinalsDate ,Date finalDate ,List<Team> teams){
		
		this.quarterDate = quarterDate;
		this.semifinalsDate = semifinalsDate;
		this.finalDate = finalDate;
		this.teams = teams;
	}
	//new ArrayList gets default value
	public Calendar(Date quarterDate ,Date semifinalsDate ,Date finalDate){
		
		this(quarterDate, semifinalsDate, finalDate, new ArrayList());
	}
	//when constructor is empty we fill it with default values
	public Calendar(){
		
		this(new Date(), new Date(), new Date(), new ArrayList());
	}
	
	public Calendar  setQuarterDate(Date quarterDate){
		
		this.quarterDate = quarterDate;
		return this;
	}
	public Date getQuarterDate(){
		
		return this.quarterDate;
	}
	public Calendar  setSemifinalsDate(Date semifinalsDate){
		
		this.semifinalsDate = semifinalsDate;
		return this;
	}
	
	public Date setSemifinalsDate(){
		
		return this.semifinalsDate;
	}
	public Calendar setFinalDate(Date finalDate){
		
		this.finalDate = finalDate;
		return this;
	}
	public Date getFinalDate(){
		
		return this.finalDate;
	}
}







