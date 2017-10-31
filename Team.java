import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private String name;
	private String coachName;
	//the maximum number of players of a team is 24
	private static final int maxPlayers = 24;
	private List <Player> players = new ArrayList();
	
	
	public Team(String name, String coachName, List<Player> players){
		
		this.name = name;
		this.coachName = coachName;
		this.players = players;
		
	}
	
	public Team(String name, String coachName){
		
		this.name = name;
		this.coachName = coachName;
		
	}
	
	public Team(String name){
		
		this.name = name;

	}
	
	public Team setName(String name){
		
		this.name = name;
		return this;
	}
	public String getName(){
		
		return this.name;
	}
	public Team setCoach(String coachName){
		
		this.coachName = coachName;
		return this;
		
	}
	public String getCoach(){
		
		return this.coachName;
	}
	public void addPlayer(Player player){
		
		if(this.getPlayers().size() < maxPlayers){
			
			players.add(player);
			
		}
	}
	public void removePlayer(Player player){
		
		players.remove(player);
	}
	
	//returns all the list
	public List<Player> getPlayers(){
		
		return this.players;
	}

}
