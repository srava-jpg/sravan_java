package constructor2;

public class Calculation13 {
	
		
	Calculation13(int a, double b){
		System.out.println(a);
		System.out.println(b);
		
		double sum = a + b;
		System.out.println("sum is: " + sum);
		System.out.println("-------");
		
		double mul = a*b;
		System.out.println(mul);
	}

	public static void main(String[] args) {
		
		Calculation13 A = new Calculation13(10, 5.5);
		
	}

}
