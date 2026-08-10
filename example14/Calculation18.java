package example14;
import java.util.*;

public class Calculation18 {
	static boolean isVowel(char ch) {
		return ch== 'a' || ch== 'e'|| ch== 'i' || ch== 'o' || ch== 'u' ;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word : ");
		String sat = sc.next();
				
		for(int i=0; i<sat.length();i++) {
			
			if(isVowel(sat.charAt(i))) {
				System.out.println(" vowel at index: " + i);
			}
			
			else {
				System.out.println("not vowel at index: " + i);
			}	
		}
		
		
		}

}


// sravan
// 012345