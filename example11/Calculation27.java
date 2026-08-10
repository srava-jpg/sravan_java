package example11;



public class Calculation27 {
	
	void show(){
		System.out.println("sravan");
	}
}
	
	class Display extends Calculation27 {
	@Override	
	void show(){
		System.out.println("kumar");
	}

	public static void main(String[] args) {
		
		Display var = new Display();
		Calculation27 var1= new Calculation27();
		var.show();
		var1.show();
	}

}
