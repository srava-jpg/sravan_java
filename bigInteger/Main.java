package bigInteger;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		
		 BigInteger a = new BigInteger("3487392039829");
		 System.out.println(a);
		 
		 BigDecimal b= new BigDecimal("32398734985829.38467");
		 System.out.println(b);
		 
		 BigDecimal c= new BigDecimal("2");
		 System.out.println(c);
		 
		 
		 
		 BigDecimal  e= b.divide(c);
		 System.out.println(e);
	}

}

