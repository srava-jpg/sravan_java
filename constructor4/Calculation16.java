package constructor4;

import java.util.*;
public class Calculation16 {
	String customerName;
	int uc;
	

	
	Calculation16(){
		customerName = "sravan";
		System.out.println(customerName);
		
		
	}

	public static void main(String[] args) {
		Calculation16 A = new Calculation16();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter units: ");
		int uc = sc.nextInt();
		
		double totalAmount;
		
		if(uc>20 || uc<30) {
			totalAmount = uc * 3;
			System.out.println(totalAmount);
		}
		
		else if(uc>30 || uc<40) {
			totalAmount = uc *10;
			System.out.println(totalAmount);
		}
		
	}

}
