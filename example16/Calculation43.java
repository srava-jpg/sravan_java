package example16;

import java.util.Scanner;

public class Calculation43 { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sec: ");
		double a = sc.nextDouble();
				
		double  hour = a/3600;
		double remainingsec = a%3600;
		
		double min = remainingsec/60;
		double seconds = remainingsec%60;
		
		
		System.out.println(hour);
		System.out.println(remainingsec);
		System.out.println(min);
		System.out.println(seconds);
		
	}

}
