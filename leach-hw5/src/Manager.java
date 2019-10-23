
/* Created by Daniel Leach */

// Manager Subclass
public class Manager extends Employee {

	private double bonus;
	// Default Constructor
	Manager(){
		super("",0);
		this.bonus = 0;
	}
	Manager(double b,String n,double base){
		super(n,base);
		this.bonus = b;
	}
	
	
	// Manager Password Validation
	public boolean checkPassword(String s) {
		boolean numberFlag = false;
		boolean capitalFlag = false;
		boolean lowerCaseFlag = false;
		if(s.length() >= 10) {
			for(int i = 0; i < s.length();i++) {
				char ch = s.charAt(i);
				if(Character.isDigit(ch)) {
					numberFlag = true;
				}
				if(Character.isUpperCase(ch)) {
					capitalFlag = true;
				}
				if(Character.isLowerCase(ch)) {
					lowerCaseFlag = true;
				}
			}
		}
		if(numberFlag && capitalFlag && lowerCaseFlag && s.matches("[a-zA-Z0-9]*")) {
			return true;
		}
		return false;
	}
	
	// Getter Method
	public double getSalary() {
		return this.getBaseSalary() + this.bonus;
	}
}
