package example19;

public class Pattern1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		
		arr[0][0] = 120;
		
		System.out.println(arr.length);

		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
