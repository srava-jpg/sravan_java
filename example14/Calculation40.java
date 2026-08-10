package example14;
import java.util.*;

public class Calculation40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		
		int num = a;
		int sum = 0;
		
		while(a != 0) {
			int last = a%10;
			int factorial =1;
			for(int i=1; i<=last; i++) {
				factorial = factorial * 1;
				
			}
			sum= sum + factorial;
			a = a/10;
		}
		if(sum == num) {
			System.out.println(num);
		}
		
	}

}
