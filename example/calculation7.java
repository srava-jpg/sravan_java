package example;
import java.util.Scanner;

public class calculation7 {
	
	
	
	public static void main(String[] args) {
		
		calculation7 A = new calculation7();
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("enter principal amount: ");
		double B = sc.nextDouble();
		
		System.out.println("rate: ");
		int C = sc.nextInt();
		
		System.out.println("time: ");
		int D = sc.nextInt();
		
		 double simpleInterest = (B*C*D) /100;
		 
		 double totalAmount = B + simpleInterest;
		
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(simpleInterest);
		System.out.println(totalAmount);
	}
}