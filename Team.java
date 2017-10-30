import java.util.ArrayList;
import java.util.List;

public class Team {

	private List<Player> team = new ArrayList<>();
	private String name;
	
	public Team(String name){
		this.name = name;
	}
	
	//get methods
	
	private String getName(){
		return this.name;
	}
	
	//----
	
	private void addPlayer(Player player){
		this.team.add(player);
	}
	
}
