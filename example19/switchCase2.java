package example19;

import java.util.Scanner;

public class switchCase2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String c = " ";
		double price2 = 0;
		
		do {
			System.out.println("enter items2: ");
			String item2 = sc.next();
			switch(item2) {
			
			case("Beverages") -> {
				System.out.println("enter morning time items: ");
				String morningTime = sc.next();
				
				switch(morningTime) {
				case("tea") -> price2 = price2 + 20;
				case("coffee") -> price2 = price2 + 500;
				case("juice") -> price2 = price2 + 80;
				default -> System.out.println("not a morning item: ");
				}
				
			}
			
			}System.out.println("price2: " + price2);
		
		String b = " ";
		double price1 = 0;
		do {
			System.out.println("enter items1: ");
			String item1 = sc.next();
			switch(item1) {
			
			case("nonVeg") -> {
				System.out.println("enter non veg items: ");
				String nonVeg = sc.next();
				
				switch(nonVeg) {
				case("chickenBiryani") -> price1 = price1 + 300;
				case("chickenBurger") -> price1 = price1 + 180;
				case("chickenPizza") -> price1 = price1 + 350;
				default -> System.out.println("not a nonveg item: ");
				}
				
			}
			
			}System.out.println("price1: " + price1);
						
		String a = " ";
		double price = 0;
		
		do {
		System.out.println("enter items: ");
		String category1 = sc.next();	
		
		switch(category1) {		
		
		case "veg" -> {
			System.out.println("enter veg items: ");
			String vegItem = sc.next();
			
			switch(vegItem) {
			
			case("paneerBiryani") -> price = price + 200;
			case("vegBurger") -> price = price + 120;
			case ("vegPizza") -> price = price + 250;
			default -> System.out.println("invalid item: ");
			}
			
		}
		
		
		}System.out.println("price: " + price);
		
			System.out.println("press y for another item or n to exit: ");
			a = sc.next();
		}
		while(a.equalsIgnoreCase("y"));
			System.out.println("total price: " + price);
		
			
			
			
		System.out.println("enter p to continue or s to exit: ");
		b = sc.next();		
	}while(b.equalsIgnoreCase("p"));
		System.out.println("total price1: " + price1);
		
		
		
		
		
		System.out.println("enter c to continue or e to exit: ");
		c = sc.next();
	}				
		while(c.equalsIgnoreCase("c"));
		System.out.println("exit: ");
	}
}
