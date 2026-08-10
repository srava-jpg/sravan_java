package example17;

import java.util.Scanner;

public class Calculation51 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salary = 30000;
		
		System.out.println("Calculate salary: ");
		System.out.println("bonus: ");
		System.out.println("tax: ");
		System.out.println("net salary: ");
		
		System.out.println("select operation: ");
		int operation = sc.nextInt();
		
		
		switch(operation) {
		case 1 -> 
		{
			System.out.println("salary: " + salary);
		}
		
		case 2 -> {
			System.out.println("bonus: ");
			double bonus = sc.nextDouble();
			
			double bonusAmount = salary* 20/100;
			System.out.println(bonusAmount);
			
		}
		
		
		case 3 -> {
			
			
			double taxAmount = salary * 10/100;
			System.out.println(taxAmount);
			
		}
		
		case 4 -> {
			
			double bonusAmount = salary* 20/100;
			double taxAmount = salary * 10/100;
			double totalSalary = salary + bonusAmount - taxAmount;
			System.out.println(totalSalary);
		}
		
		default -> {
			System.out.println("exit: ");
		}
		}
		}
}
