package example8;

public class Calculation24 {
	
	String name;
	int id;
	int marks;
	String branch;

	Calculation24(){
		this("sravan");
		System.out.println("one");
	}
	
	Calculation24(String name){
		this(name, 123);
		System.out.println("two");
	}
	
	Calculation24(String name, int id){
		this(name, id, 200);
		System.out.println("three");
	}
	
	Calculation24(String name, int id, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	
	void main() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
	}
	public static void main(String[] args) {
		
		Calculation24 A = new Calculation24();
		A.main();
	}

}
