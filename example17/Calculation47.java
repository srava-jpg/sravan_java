package example17;

import java.util.Scanner;

public class Calculation47 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int attempted = 0;
		int marks = 0;
		int totalmarks = 20;
		
		
		System.out.println("Correct answer = 1, incorrect answer = 0, Question not attempted = -1");
		
		for(int i=1; i<=20; i++) {
			System.out.println("question" + i);
		

		int response = sc.nextInt();
		if(response == 1) {
			attempted++;
			marks++;
			
		}
		
		else if(response == 0) {
			attempted++;
			
		}
		
		else if(response == -1){			
			continue;
		}
		else {
			System.out.println("invalid input");
		}
	
		}
		double percentage = marks * 100/totalmarks;
		
		System.out.println(marks);
		System.out.println(percentage);
		System.out.println(attempted);
		}
		
	}


