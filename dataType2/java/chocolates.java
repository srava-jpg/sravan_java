package dataType2.java;

public class chocolates {

	public static void main(String[] args) {
		int cost = 20;
		int totalPrice = 425;
		int freeChocolate = 10;
		
		int noOfChocolates = totalPrice/cost;
		int freeChocolates1 = cost/freeChocolate;
		int totalChocolates = noOfChocolates + freeChocolates1;
		
		
		System.out.println(noOfChocolates);
		System.out.println(freeChocolates1);
		System.out.println(totalChocolates);
		
	}

}
