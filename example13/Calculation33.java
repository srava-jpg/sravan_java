package example13;
import java.util.*;

public class Calculation33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		
		boolean prime = true;
		
		if(a<=1) {
			prime = false;
		}
		
		for(int i=2; i<a; i++) {
			if(a%i == 0) {
				prime = false;
				break;
			}
		}
		
		if(prime == true) {
			System.out.println("prime number: ");
		}
		
		else {
			System.out.println("not a prime: ");
		}
	}
}
