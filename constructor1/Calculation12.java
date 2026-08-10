package constructor1;

import java.util.*;

public class Calculation12 {
	
	Calculation12(int id, String bookName){
		
		System.out.println(id);
		System.out.println(bookName);		
	}
		

	public static void main(String[] args) {
		Calculation12 A = new Calculation12(10, "enter the dragon");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter books");
		int totalBooks = sc.nextInt();	
		double totalAmount;
		
		if(totalBooks>5 && totalBooks<=10) {
			totalAmount = totalBooks * 5;
			System.out.println(totalAmount);
		}
		
		else if(totalBooks>10 && totalBooks<=20){
			totalAmount = totalBooks * 7;
			System.out.println(totalAmount);
		}
		
	}

}
