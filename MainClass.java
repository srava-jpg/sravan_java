package smallProject;

import java.util.Scanner;

public class MainClass implements Maininterface{

	// In homeloan i am not satisfied with ROI so to modify it we create the Maininterface
	// so MainClass overrides the all the methods by using MainInterface
	
static Scanner sc = new Scanner(System.in);
	
	@Override
	public int validAge() {
		System.out.println("enter the age: ");
		int age = sc.nextInt();
		return age;		
	}
	
	@Override
	public double validSalary() {
		System.out.println("enter the salary: ");
		double salary = sc.nextDouble();		
		return salary;
	}
	
	@Override
	public int cibilScore() {
		System.out.println("enter score: ");
		int score = sc.nextInt();
		return score;
	}
	
	// The main requirement of MainInterface creation int his project is to modify Roi. so we implement it. 
	// And one more thing is method should be public to not reduce the scope
	
	@Override
	public double calculateRoi() {
		double roi = 5.0;
		
		int score = cibilScore();
		if(score>300 && score<=450) {
			System.out.println("poor: So hard to get loan: ");
			roi = roi + 5.0;
		}
		
		else if(score>450 && score<=600) {
			System.out.println("good: there is chances to get loan: ");
			roi = roi + 3.0;
		}
		
		else if(score>600 && score<=750) {
			System.out.println("superb: there is high chances to get loan: ");
			roi= roi + 1.0;
		}
		
		else {
			System.out.println("there is no chance for loan: ");
			roi = roi + 7.0;
		}
		return roi;
	}   
	
	@Override
	public boolean isValidName() {
		System.out.println("enter your name: ");
		String name = sc.next();
		boolean valid = name.matches("[A-Z][a-z]{5}");
		return valid;
	}
	
	@Override
	public boolean isValidPancard() {
		System.out.println("enter your pannumber: ");
		String pan = sc.next();
		boolean number = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
		return number;
	}
	
	@Override
	public boolean isValidAadhar() {
		System.out.println("enter your aadharnumber: ");
		String aadhar = sc.next();
		boolean num = aadhar.matches("[0-9]{12}");
		return num;
	}
	


}
