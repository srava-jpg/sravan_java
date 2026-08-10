package constructor4;

public class Calculation15 {
	double r;
	double d;
	double cf;
	double a;

	Calculation15(int a, int b){
		System.out.println(a);
		System.out.println(b);
	}
	
	Calculation15(){
		r = 7;
		d = 2*r;
		cf = 2 *Math.PI *r;
		a = Math.PI * r*r;
		
		System.out.println(r);
		System.out.println(d);
		System.out.println(cf);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Calculation15 A = new Calculation15(5,10);
		
		Calculation15 B = new Calculation15();
		
	}

}
