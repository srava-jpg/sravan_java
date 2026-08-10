package example13;
import java.util.*;

public class Calculation31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num: ");
		int a = sc.nextInt();
		
		int reverse = 0;
		
		while(a != 0) {
			int digit = a%10;
			reverse = reverse * 10 + digit;
			a = a/10;
			
		}
		System.out.println(reverse);
	}
}
