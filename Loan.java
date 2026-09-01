package smallProject;
import java.util.*;

public class Loan extends MainClass{

	
	public static void main(String[] args) {
		
		Loan a = new Loan();
				
		if(a.isValidAadhar() && a.isValidName() && a.isValidPancard()) {
			System.out.println("your details are enough to move to the next process: ");
			
			double roi = a.calculateRoi();
			if(a.validAge() >= 22 && a.validSalary() > 700000 && (a.cibilScore() > 600 && a.cibilScore()<= 750)){
				System.out.println("you are eligible for loan" + roi);
			}
		
		else {
			System.out.println("details are not matched to our requirements: ");
		}
		}
		else {
			System.out.println("something mismatch occurs: ");
		}
	}
	
	
}

	