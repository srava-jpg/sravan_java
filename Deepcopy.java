package example25;

public class Deepcopy {

	public static void main(String[] args)  throws CloneNotSupportedException {
		
		Address a = new Address("nellore");
		Student b = new Student("sravan", a);
		Student c = (Student)b.clone();
		
		c.address.city="tirupathi";
		System.out.println(a.city);
		System.out.println(b.address.city);
		System.out.println(c.address.city);
		
	}

}

class Address{
	
	String city;
	
	Address(String city){
		this.city= city;
}
}

class Student implements Cloneable{
	String name;
	Address address;
	
	Student(String name, Address address){
		this.name = name;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException { 
		return super.clone(); 
	}
	
}

