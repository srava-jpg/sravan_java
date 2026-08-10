package rectangle;

public class arguments3 {
	
	void main(int length, int breadth) {
		System.out.println(length);
		int area = length * breadth;
		System.out.println(area);
	}

	public static void main(String[] args) {
		
		arguments3 A = new arguments3();
		A.main(10,20);

	}

}
