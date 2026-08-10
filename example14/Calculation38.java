package example14;
import java.util.*;

public class Calculation38 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers: ");
		int[] c = new int[26];
		
		for(int i=0; i<=26; i++) {
			c[i] = sc.nextInt();
			System.out.println(c[i] + "=" + (char) c[i]);
		}
	
	}
}
