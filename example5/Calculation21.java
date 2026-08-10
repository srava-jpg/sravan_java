package example5;

public class Calculation21 {
	
	String collegeName;
	String city;
	int students;
	
	Calculation21(String collegeName, String city){
		this.collegeName=collegeName;
		this.city= city;
		
	}
	
	Calculation21(String collegeName, int students){
		this.collegeName = collegeName;
		this.students = students;
		
	}
	
	Calculation21(String collegeName, String city, int students){
		this.collegeName = collegeName;
		this.city = city;
		this.students = students;
	}
	
	
	
	void main() {
		
		System.out.println("college name: " + collegeName);
		System.out.println("city: "+ city);
		System.out.println("students: " + students);
	}
	
	

	public static void main(String[] args) {
		
		Calculation21 A = new Calculation21("nbkr", "nellore");
		Calculation21 B = new Calculation21("narayana", 100);
		Calculation21 C = new Calculation21("vcube", "hyderabad", 50);
		A.main();
		B.main();
		C.main();
		
	}

}
