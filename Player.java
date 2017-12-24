public class Player {

	private String name;
	private int age;
	private PlayerCard pcard;
	
	public Player(String name, int age){
		this.name = name;
		this.age = age;
		this.setPcard(new PlayerCard());
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
		this.getPcard().addGoalScored();
		System.out.println("GOOOOOL: " + this.getName() + "!!!!!");
	}
	
}
