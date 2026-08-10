package example19;

public class Inheritance {
	
	int a;
	String name;
	
	Inheritance(int a, String name){
		this.a = a;
		this.name = name;
	}
	
	Inheritance(Inheritance k, String name){
		this.a = k.a;
		this.name = name;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Inheritance x = new Inheritance(10, "sravan");
		x.display();
		
		Inheritance y = new Inheritance(x, "kumar");
		y.display();
		
		Child a = new Child();
		Child1 b = new Child1();
		
		a.hello1();
		b.hello2();
	}

}

 class Parent{
	
	public void hello1() {
		System.out.println("my age is 22: ");
	}
}
 class Child extends Parent {

		public void hello() {
			System.out.println("my name is sravan: ");
		}
	}

 class Child1 extends Child{
	 public void hello2() {
		 System.out.println("i am from nellore: ");
	 }
 }