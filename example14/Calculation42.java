package example14;
import java.util.*;


public class Calculation42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st number: ");
		int a = sc.nextInt();
		
		System.out.println("enter 2nd number: ");
		int b= sc.nextInt();
		
		System.out.println("enter 3rd number: ");
		int c = sc.nextInt();
		
		int temp =a;
		a= b;
		b= c;
		c = temp;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);		
		
	}

}
