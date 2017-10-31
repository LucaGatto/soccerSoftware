
public class Player {
	
	private String name;
	private int age;
	
	public Player(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	public Player setName(String name){
		
		this.name = name;
		return this;
	}
	public String getName(){
		
		return this.name;
	}
	public Player setAge(int age){
		
		this.age = age;
		return this;
	}
	public int getAge(){
		
		return this.age;
	}
	
	
	
	

}
	
