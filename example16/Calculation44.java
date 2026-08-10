package example16;

import java.util.Scanner;

public class Calculation44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter A marks: ");
		int a = sc.nextInt();
		System.out.println ("enter B marks: ");
		int b = sc.nextInt();
		System.out.println("enter C marks: ");
		int c = sc.nextInt();
		System.out.println("enter D marks: ");
		int d = sc.nextInt();
		System.out.println("enter E marks: ");
		int e = sc.nextInt();
		
		System.out.println("enter total marks: ");
		double totalMarks = sc.nextDouble();
		
		double Marks = a+b+c+d+e;
		System.out.println(Marks);
		System.out.println("-------");
		
		double percentage = Marks/totalMarks * 100;
		
		
		if(percentage >= 90) {
			System.out.println("grade A: " + percentage);
		}
		
		else if(percentage >= 75 && percentage<90) {
			System.out.println("grade B: " + percentage);
		}
		
		else if(percentage >= 60 && percentage<75) {
			System.out.println("grade C: " + percentage);
		}
		
		else {
			System.out.println("grade D: " + percentage);
		}
		
		
	}

}
