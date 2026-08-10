package bill;

import java.util.Scanner;

public class calculation6 {
	
	void calculateBill() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter customer name: ");
		 String name = sc.nextLine();
		 
		 System.out.println("no of units consumed: ");
		 int consumed = sc.nextInt();
		 int price = 5;
		 double total = price* consumed;
		 
		 
		 if(consumed <= 100){
			 total = consumed * 3;
		 }
			 else if(consumed >100 && consumed<=200) {
				 total = consumed * 5;
			 }
			 
			 else {
				 total = consumed*10;
			 }
		 
		 System.out.println(name);
		 System.out.println(consumed);
		 System.out.println(total);
		 
		 
	}

	public static void main(String[] args) {
		calculation6 A = new calculation6();
		
		A.calculateBill();
		

	}

}
