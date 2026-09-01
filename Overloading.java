package example24;

public class Overloading {

	public static void main(String[] args) {
		
		Something a = new Something();
		a.variables(10, 20, "sravan");
		a.variables(10, 20);
	}

}

class Something{
	
	
	public void variables(int a, int b, String c) {
		System.out.println("it is valid: ");
	}
	
	public void variables(int a, int b) {
		System.out.println("it is not valid: ");
	}
}