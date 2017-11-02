import java.util.ArrayList;
import java.util.List;

public class Matchweek {

	private List<Match> matches = new ArrayList<>();
	private String name;
	
	public Matchweek (String name, List<Match> matches){
		this.name = name;
		this.matches = matches;
	}
	
	protected String getName(){
		return this.name;
	}
	
	protected List<Match> getMatches(){
		return this.matches;
	}
}
