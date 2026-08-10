package example17;

public class Calculation57 {
	

	public String name = "sravan";		
	
	public void hi() {
		System.out.println(name);
	}
}

class B extends Calculation57 {


void hello() {
hi();
}

public static void main(String[] args) {
B b = new B();
b.hello();
}

}
