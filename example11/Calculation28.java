package example11;



public class Calculation28 {
	
	void show(){
		System.out.println("sravan");
	}
}
	
	class Display1 extends Calculation28 {
	@Override	
	void show(){
		System.out.println("kumar");
	}

	public static void main(String[] args) {
		
		Display1 var = new Display1();
		Calculation28 var1= new Calculation28();
		var.show();
		var1.show();
	}

}
