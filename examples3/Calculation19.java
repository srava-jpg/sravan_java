package examples3;

public class Calculation19 {
	
	int n;
	int i;
	int result;
	void method() {
		n =7;
		
		for(i=1; i<=n; i++) {
			result = n * i;
			
				 System.out.println(n + "*" +  i + "=" + result);			
			
		}
	}

	public static void main(String[] args) {
		
		Calculation19 A = new Calculation19();
		A.method();
		
	}

}
