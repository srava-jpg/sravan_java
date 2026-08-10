package primitiveType;

public class calculation {
	
	Integer empNo = 1234;
	Double bonus = 10d;
	String eName = "sravan";
	Double salary = 5000d;
	String hireDate = "1/07/2026";
	Integer Experience = 2;
	
	Double annualSalary = salary*12;
	
	Double bonusAmount = annualSalary*10/100;
	
	Double totalAmount = annualSalary + bonusAmount;
	
	Double bonusAmount1 = annualSalary * 5/100;
	
	Double totalAmount1 = annualSalary + bonusAmount1;

	
	
	public static void main(String[] args) {
		calculation a = new calculation();
		
		System.out.println(a.empNo);
		
		
		System.out.println(a.bonus);
		System.out.println(a.eName);
		System.out.println(a.salary);
		System.out.println(a.hireDate);
		
	
		System.out.println("salary: " +a.salary  );
				
		System.out.println(a.annualSalary);
		System.out.println(a.bonusAmount);
		System.out.println(a.totalAmount);
		
		System.out.println(a.bonusAmount1);
		System.out.println(a.totalAmount1);
		
		
		
	}

}
