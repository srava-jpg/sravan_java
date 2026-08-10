package average;
import java.util.Scanner;

public class calculation8 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int A = sc.nextInt();
		
		System.out.println("enter second number: ");
		int B = sc.nextInt();
		
		System.out.println("enter third number: ");
		int C = sc.nextInt();
		
		System.out.println("enter fourth number: ");
		int D = sc.nextInt();
		
		double sum = (A + B + C+ D) /4;
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(sum);
		
		
	}

}
