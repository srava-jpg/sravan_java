package calculation1;

public class elctricityBill {
	
	String a = "sravan";
	
	{
	double units = 70;
	double fixedCharge = 100;
	float perUnitCharge = 1.5f;
	double total = units * perUnitCharge + fixedCharge;
	
	System.out.println(units);
	System.out.println(fixedCharge);
	System.out.println(perUnitCharge);
	System.out.println(total);
	}

	public static void main(String[] args) {
		elctricityBill A = new elctricityBill();
		System.out.println(A.a);
		
	
		
	}

}
