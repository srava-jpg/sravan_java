package example23;

public class Inherits {

	public static void main(String[] args) {	
		Car a = new Car();
		a.drive();		
	}

}

class Vehicle{
public void start() {
	System.out.println("the car is started: ");
}
}


class Car extends Vehicle{

	public void drive() {
		System.out.println("it is ended: ");
	}
}