import java.util.ArrayList;
import java.util.List;

public class Tournament {

	private String name;
	
	private List<Team> teams = new ArrayList<>();
	private Calendar calendar;
	private String results;
	private String quarter;
	private String semi;
	private String finalMatch;
	
	public Tournament(String name,List<Team> teams){
		this.name = name;
		this.teams = teams;
		this.calendar = new Calendar(this.teams);
	}
	
}
