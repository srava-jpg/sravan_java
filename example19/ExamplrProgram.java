package example19;

import java.util.Scanner;

public class ExamplrProgram {
	
	static boolean isNonPrime(int n) {
		
		if(n==1) {
			return true;
		}
		
		for(int k=2;k<n-1;k++) {
			if(n%k == 0) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the rows: ");
		int rows = sc.nextInt();
		int prm=1;
		
		for(int i=1;i<=rows;i++) {
			int[] arr=new int[i];
			int index=0;
			
			while(i>index) {
				if(isNonPrime(prm)) {
					arr[index]=prm;
					index++;
				}
					
			prm++;
		
			
			}
			if(i%2==0) {
				for(int h=arr.length-1;h>=0;h--) {
					System.out.print(arr[h]+ " ");
				}
			}
			else {
				for(int h=0;h<=arr.length-1;h++) {
					System.out.print(arr[h]+" ");
				}
				
			}
			System.out.println("");
		}
	}

}
