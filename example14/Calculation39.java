package example14;
import java.util.*;

public class Calculation39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		
		int original=a;
		int count =0;
		while(a != 0) {
			a=a/10;
			count++;
			
		}
		System.out.println(count);
		
		int sum =0;
		int num = a;
		while(a != 0){
			num=a%10;
			sum = sum + (int) Math.pow(num, count);
		}
		if(sum == original) {
			System.out.println(sum);
		}

	}

}
