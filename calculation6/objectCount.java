package calculation6;

public class objectCount {
	
	String rollNo = "123";
	String name = "sravan";
	String salary = "30000.67";
	int count = 0;
	
	{
		count++;
		method();
		double B = Double.parseDouble(salary);
		System.out.println(B);
		
		int C = Integer.parseInt(rollNo);
		System.out.println(C);
		
		System.out.println(count);
		
	}
	
	public void method() {
		Double a = 597.8;
		double b = a;
		System.out.println(b);
	}
	public static void main(String[] args) {
		 
		objectCount A = new objectCount();
		objectCount B = new objectCount();		
		
	}
		
			
}
