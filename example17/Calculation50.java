package example17;

import java.util.Scanner;

public class Calculation50 {
	
	static Scanner sc = new Scanner(System.in);

	 double cibil() {
		 System.out.println("enter cibil: ");
		 double cibilNumber = sc.nextDouble();
		 
		 return cibilNumber;
	 }
	 
	 int age() {
		 System.out.println("enter age: ");
		 int age1 = sc.nextInt();
		 
		 return age1;
	 }
	 
	 double salary() {
		 System.out.println("enter salary: ");
		 double monthSalary = sc.nextDouble();
		 
		 return monthSalary;
	 }	 
	 boolean panCard() {
		 
		 System.out.println("enter pancard: ");
		 String panNumber = sc.next();
		 boolean isValidPan = panNumber.matches("^[A-Z]{5} [0-9]{4}[A-Z]{1}");
		 return isValidPan;
	 }
	boolean mobileNumber() {
		
		System.out.println("enter number: ");
		String number = sc.next();
		boolean formula = number.matches("[0-9]{10}");
		return formula;
	}
	 
	
	public static void main(String[] args) {
		
		Calculation50 a = new Calculation50();
		System.out.println(a.panCard());
		
		System.out.println(a.mobileNumber());		
		double cibilNumber = a.cibil();
		
		int age1 = a.age();
		double monthSalary = a.salary();
		
		
		if(cibilNumber <300 && (monthSalary >20000 && monthSalary<=30000) && age1 <50) {
			System.out.println("poor performance: ");
			System.out.println("you are eligible for loan but roi is high: ");
		}
		
		else if((cibilNumber >=300 && cibilNumber < 500) && monthSalary <= 40000 && age1 < 30){
			System.out.println("good: ");
		}
		
		else {
			System.out.println("excellent: ");
		}
	}
}
