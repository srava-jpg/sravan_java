package example12;

public class Calculation29 {
	
	int bookId;
	String title;
	String author;
	
	Calculation29(int bookId, String title, String author){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	Calculation29(int bookId, String title,Calculation29 c ){
		this.bookId = bookId;
		this.title = title;
		this.author= c.author;
		
	}
		
	void display() {
		System.out.println(bookId);
		System.out.println(title);
		System.out.println(author);
	}

	public static void main(String[] args) {
		
		Calculation29 a = new Calculation29(123, "wings of fire", "abdul kalam");
		a.display();
		
		Calculation29 b = new Calculation29(102,"enter the dragon",a);
		b.display();
	}

}
