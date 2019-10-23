
/* Created by Daniel Leach */

public class TechnicalStaff extends Employee {

	// Default constructors 
	public TechnicalStaff() {

		super("",0);
	}
	public TechnicalStaff(String n, double base) {
		super(n,base);
		
	}
	// check Password Method for Technical Staff
	public boolean checkPassword(String s) {
		boolean numberFlag = false;
		boolean letterFlag = false;
		if(s.length() >= 8) {
			for(int i = 0; i < s.length();i++) {
				char ch = s.charAt(i);
				if(Character.isDigit(ch)) {
					numberFlag = true;
				}
				if(Character.isUpperCase(ch)||Character.isLowerCase(ch)) {
					letterFlag = true;
				}
			}
		}
		if(numberFlag && letterFlag && s.matches("[a-zA-Z0-9]*")) {
			return true;
		}
		return false;
		
	}
	
	// getter method 
	public double getSalary() {
		return this.getBaseSalary();
	}
	
	
	
}
