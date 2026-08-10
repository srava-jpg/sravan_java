package calculation3;
import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		int A = sc.nextInt();
		
		if(A % 5 ==0) {
			System.out.println("a");
		}
		
		else if(A % 3 ==0) {
			System.out.println("b");
		}
		
		else if(A % 5==0 && A % 3==0){
			System.out.println("c");
		}
		
		
}
}