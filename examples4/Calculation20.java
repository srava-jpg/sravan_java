package examples4;
import java.util.*;

public class Calculation20 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 5 numbers: ");
		int A = sc.nextInt();
		
		int[] B = new int[5];
		
		int i;
		int sum =0;
		
		for(i=0; i<B.length; i++) {
			B[i] = sc.nextInt();
			sum += B[i];
		}
		
		System.out.println(B[i]);
		System.out.println(sum);
	
		
	}

}
