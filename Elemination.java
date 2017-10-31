import java.util.*;
public class Elemination {
	
	private Date date;
	private List<Team> matches = new ArrayList();
	private List<Team> column1 = new ArrayList();
	private List<Team> column2 = new ArrayList();
	
	
	
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
	
	//fusim listen e ekipeve => random => zgjedhim ndeshjet => per me kollaj i ndajme ne dy lista dhe i kapim me index
	public Date getMatches(List<Team> teams){
		
		for(int i = 0; i < teams.size(); i++){
		
			if( (i+1) % 2 == 1){
				
				column1.add(teams[i]);
			}
			else{
				
				column2.add(teams[i]);
			}
			
		}
		
	}
	public Date addMatch(){}
}
