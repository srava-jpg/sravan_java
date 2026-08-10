package example14;
import java.util.*;

public class Calculation41 {

	public static void main(String[] args) {
		
		int a= 15;
		int b= 25;
		int c = a^b;
		
		a = a^c;
		b = b^c;
		
		
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
	}

}
