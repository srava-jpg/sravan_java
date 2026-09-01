package example20;

public class AtmUsingPrivateData {
	
	private double balance;
	public double deposit;
	public double withdraw;
	
	public void setBalance(double balance) {
		
		if(balance > withdraw) {
			this.balance = balance;
			System.out.println("remaining balance:" + balance);
		}
	}
	
	public void enterDeposit(double deposit) {
		this.deposit = deposit;
		deposit = deposit + balance;
		if(deposit>0) {
			System.out.println("deposit amount is greater than zero: " + deposit);
		}
		else {
			System.out.println("sorry your balance is not sufficient: ");
		}
	}
	
	
	
	
	public void enterWithdraw(double withdraw) {
		this.withdraw = withdraw;
		if(withdraw>0) {
			
			System.out.println("valid withdraw amount: " + withdraw);
		}
		else if(withdraw > balance) {
			System.out.println("insufficient balance; ");
		}
		else {
			balance = balance - withdraw;
			System.out.println("remaining balance: " + balance);
		}
		
	}
	
	
	
	
	

	public double getBalance() {
		return balance;
		
	}
	
	

	public static void main(String[] args) {
		
		AtmUsingPrivateData b = new AtmUsingPrivateData();
		b.enterDeposit(30000);
		b.enterWithdraw(5000);
		
		
	}

}
