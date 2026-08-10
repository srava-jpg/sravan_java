package example9;



public class Calculation25 {
	
	void show(){
		System.out.println("sravan");
	}
}
	
	class Display1 extends Calculation25 {
	@Override	
	void show(){
		System.out.println("kumar");
	}

	public static void main(String[] args) {
		
		Display1 var = new Display1();
		Calculation25 var1= new Calculation25();
		var.show();
		var1.show();
	}

}
