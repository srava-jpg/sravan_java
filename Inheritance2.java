package example23;

public class Inheritance2 {

	public static void main(String[] args) {
		
		Students a = new Students();
		
	}

}

class Person{
	String name = "sravan";
	int age;
	public void Person(String name, int age) {
		this.name = name;
	}
}

class Students extends Person{
	
}
