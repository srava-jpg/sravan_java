package example19;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of salaries: ");
		int num = sc.nextInt();
		
		System.out.println("enter salary: ");
		 double sal = sc.nextDouble();
		 
		 double high = sal;
		 double low = sal;
		 double sum = 0;
		 double total = 0;
		 double avg;
		
		for(int i=0; i<num; i++) {
			
			System.out.println("enter the salary as example: ");
			double enterSal = sc.nextDouble();
			
			sum = sum + enterSal;
			total = total + enterSal;
			
			if(enterSal > high) {
				 high = enterSal;
			}
			
			if(enterSal < low) {
				low= enterSal;
			}
		
		}
		avg = sum/num;
		
		System.out.println("highest salary: " + high);
		System.out.println("lowest salary: " + low);
		System.out.println("avg sal: " + avg);
		System.out.println("total sal: " + total);
		
}
}