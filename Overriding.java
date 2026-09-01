package example24;

public class Overriding {

	public static void main(String[] args) {
		
		Car a = new Car();
		System.out.println(a.display());
	}

}
class Vehicle{
	
int speed = 50;
int distance = 70;
	
	public int display() {
		return speed + distance;
	}
		
}


class Car extends Vehicle{
	int speed = 100;
	int distance = 200;
	int id = 123;
	
	@Override
	public int display() {
		return speed + distance + id;
	}
	
}
