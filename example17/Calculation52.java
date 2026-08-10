package example17;

import java.util.Scanner;

public class Calculation52 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double ticketPrice = 0;
		String pc = "";
		
		
			do {
			System.out.println("enter bookMyShow or flipkart: ");
			String bookMyShow = sc.next();
			
			switch(bookMyShow) {
			case "bookMyShow" -> {	
				System.out.println("enter movies: ");
				String  movies = sc.next();
				
				switch(movies) {
				
				case "Peddi" -> {
					ticketPrice = ticketPrice + 100;
				}
				case "RRR" -> {
					ticketPrice = ticketPrice + 150;
				}
				case "Salaar" ->{
					ticketPrice = ticketPrice + 200;
				}
				case "kalki" -> {
					ticketPrice = ticketPrice + 250;
				}
				case "varanasi" -> {
					ticketPrice = ticketPrice + 300;
				}
				
				default -> {
					System.out.println("not valid: ");
				}
				
				}
				System.out.println("ticketPrice: " + ticketPrice);
			}
			
			}
			
			String rw = "";
			double price = 0;
			
		
		do {
		System.out.println("enter zomato or swiggy: ");
		String shoppingApp = sc.next();
		
		switch(shoppingApp) {
		
		case "swiggy" -> {
		System.out.println("food items: ");
		String items = sc.next();
		
		
		switch(items) {
		
		case "biryani" -> {
			price = price + 150;	
			
		}
		case "noodles" -> {
			price = price + 100;	
		}
		case "pizza" -> {
		    price = price + 200;		   
		}
		case "burger" -> {
		    price = price + 120;		    
		}
		case "friedrice" -> {
		    price = price + 130;	    
		}
		default -> {
			System.out.println("not applicable: ");		
		}
		
		
		}
		System.out.println("price: " + price);
		
		}
		
	}	System.out.println("enter if we want to add another item r/w : ");
		rw = sc.next();
	}
		while(rw.equalsIgnoreCase("r"));
		System.out.println("totalprice: " + price);

		System.out.println("if we want to add another movie enter p or c");
		pc = sc.next();
		}while(pc.equalsIgnoreCase("p"));
			System.out.println("come out: ");
}
}
