package examples2;
import java.util.*;

public class Calculation18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int A = sc.nextInt();
		
		int count = 0;
		int i;
		
		for(i =2; i<=A; i++) {
			if(A%i == 0){
				count++;
			}
		}
		
		if(count == 1) {
			System.out.println("prime number: ");
		}
		
		else {
			System.out.println("not a prime: ");
		}
		
}
}