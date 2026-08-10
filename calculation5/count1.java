package calculation5;

import java.util.Scanner;

public class count1 {

	public static void main(String[] args) {
		int count = 0;
		 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter 5 numbers: ");
	
	int A = sc.nextInt();
	int[] arr = new int[A];
	
	for(int i=0; i <arr[A]; i++) {
		if(arr[A]) {
		
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] %2 ==0) {
			count++;
			}
		}
	}
	
	System.out.println(count);
	}

}
