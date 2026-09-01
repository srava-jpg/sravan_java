package smallProject;

public class HomeLoan extends MainClass{
	
	// To modify ROI we want to use override again
	@Override
	public double calculateRoi() {
		double roi = 7.0;
		
		int score = cibilScore();
		if(score>300 && score<=450) {
			System.out.println("poor: ");
			roi = roi + 5.0;
		}
		
		else if(score>450 && score<=600) {
			System.out.println("good: ");
			roi = roi + 3.0;
		}
		
		else if(score>600 && score<=750) {
			System.out.println("superb: ");
			roi= roi + 1.0;
		}
		
		else {
			System.out.println("there is no chance for loan: ");
			roi = roi + 7.0;
		}
		return roi;
	}   
	
	
public static void main(String[] args) {
		
		HomeLoan a = new HomeLoan();
		
		
		
		if(a.isValidAadhar() && a.isValidName() && a.isValidPancard()) {
			System.out.println("your details are enough to move to the next process: ");
			
			double roi = a.calculateRoi();
			if(a.validAge() >= 25 && a.validSalary() > 900000 && (a.cibilScore() > 400 && a.cibilScore()<= 750)){
				System.out.println("you are eligible for Homeloan" + roi);
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
