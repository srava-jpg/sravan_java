package variables;



public class variables1 {
	
	class hello{
		String c = "pavan";
	}
	
	String a = "sravan";
	static String b = "kumar";

	public static void main(String[] args) {
		
		variables1 A = new variables1();
		System.out.println(A.a);
		
		System.out.println(b);
		
		variables1.hello B = A.new hello();
		System.out.println(B.c);

	}

}
