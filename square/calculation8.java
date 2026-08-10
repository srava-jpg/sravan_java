package square;
import java.util.Scanner;

public class calculation8 {
	
	double squareNumber(int a) {
		double area = a * a;
		return area;
	}

	public static void main(String[] args) {
		
		calculation8 A = new calculation8();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num: ");
		int B = sc.nextInt();
		
		double C = A.squareNumber(B);
		System.out.println(C);
		
	}

}
