package example16;

public class Calculation45 {
	
	public int id = 102;
	public String name;
	
	Calculation45(){
		id = 101;
		name = "sravan";
	}
	
	Calculation45(Calculation45 l, String name){
		this.id = id;
		this.name = name;
	}
	
	private void hi(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id);
		System.out.println(name);
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Calculation45 a = new Calculation45();		
		a.display();
	
		Calculation45 b = new Calculation45(a, "kumar");
		b.display();
		
		Calculation45 c = new Calculation45();
		c.hi(123,"suresh");
		
		
	}
}
