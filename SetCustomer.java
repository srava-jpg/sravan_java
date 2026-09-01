package example21;

public class SetCustomer {

	public static void main(String[] args) {
		
		SameCustomerDetails a = new SameCustomerDetails();
		
		a.setCustomerid(123);
		a.setName("sravan");
		a.setPhoneno("918376347828");
		a.setEmail("sravan3487gmail.com");
		
		System.out.println(a.getCustomerid());
		System.out.println(a.getName());
		System.out.println(a.getPhoneno());
		System.out.println(a.getEmail());
	}

}
