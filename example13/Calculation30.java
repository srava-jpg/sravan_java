package example13;
import java.util.*;

public class Calculation30 {
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 6 numbers");
		int[] arr = new int[6];
		int tar=8;
		
		for(int num=0; num<6; num++) {
			arr[num] = sc.nextInt();
			
		}
		for(int num=0; num<6; num++) {
			if(tar==arr[num]) {
				System.out.println(num);
				return;
			}
		}
		System.out.println("not found");
		
		
		
		
		
		
		
	}
	

}
