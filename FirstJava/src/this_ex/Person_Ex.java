package this_ex;

public class Person_Ex {

	private String name;
	
	public Person_Ex(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("My name is " + this.name);
	}
	
	public Person_Ex() {
		this("Anonymous");
	}
}
