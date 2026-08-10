package example13;
import java.util.*;

public class Calculation32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		
		int realNum = a;
		int reverse =0;
		
		while(a != 0) {
			int last = a%10;
			reverse = reverse *10 + last;
			a = a/10;
		}
		
		System.out.println(reverse);
		if(realNum == reverse) {
			System.out.println("palindrome");
		}
		
		else {
			System.out.println("not a palindrome");
		}
	}

}
