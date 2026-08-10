package example6;

public class Calculation22 {
	
	int id;
	String name;
	
	Calculation22(){
		id = 33;
		name = "kumar";
	}
	
	Calculation22(int id, String name){
		this.id = id;
		this.name = name;
		
	}

	void main() {
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Calculation22 A = new Calculation22();
		Calculation22 B = new Calculation22(22, "sravan");
		
		A.main();
		B.main();
	}

}
