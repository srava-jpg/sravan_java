package example21;

public class SameCustomerDetails {

	private int customerid;
	private String name;
	private String phoneno;
	private String email;
	
	
	
	public int getCustomerid() {
		return customerid;
	}
	
	public void setCustomerid(int customerid) {
		this.customerid = customerid;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		if(name == "") {
			System.out.println("name cannot be empty: ");
		}
		else {
			System.out.println("name is correct: " + name);
		}
	}
	
	public String getPhoneno() {
		return phoneno;
	}
	
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
		if(phoneno.length() == 10) {
			System.out.println("it is a valid number: ");
		}
		else {
			System.out.println("not a valid number: " + phoneno);
		}
	}
	
	public String getEmail() {
		return email;
		
	}
	
	public void setEmail(String email) {
		this.email = email;
		if(email.contains("@")) {
			System.out.println("it is a valid email: " + email);
		}
		else {
			System.out.println("it is not a valid email because it doesnot contain @: " + email);
		}
		System.out.println("********");
	}
	
}
