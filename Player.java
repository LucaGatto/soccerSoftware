public class Player {

	private String name;
	private String surname;
	private int age;
	
	public Player(String name, String surname, int age){
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String getName(){
		return this.name + this.surname;
	}
	
	private int getAge(){
		return this.age;
	}
	
}
