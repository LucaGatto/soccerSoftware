package v2;

public class Player {

	private String name;
	private int age;
	private PlayerCard pcard;
	
	public Player(String name, int age, PlayerCard pcard){
		this.name = name;
		this.age = age;
		this.pcard = pcard;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public PlayerCard getPcard() {
		return this.pcard;
	}
	
	public void setPcard(PlayerCard pcard) {
		this.pcard = pcard;
	}

	public void addGoalScored() {
		this.pcard.updateStats();
		System.out.println("GOOOOOL: " + this.getName() + "!!!!!");
	}
	
}
