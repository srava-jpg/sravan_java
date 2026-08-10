package example14;
import java.util.*;

public class Calculation34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st number: ");
		int a = sc.nextInt();
		
		System.out.println("enter 2nd number: ");
		int b= sc.nextInt();
		
		int hcf = 1;
		int fix = Math.min(a, b);
		
		for(int i = 1; i <= fix; i++) {
			if(a%i == 0 && b%i == 0) {
				hcf = i;
				
			}
			
		}
		System.out.println(hcf);
	}

}
