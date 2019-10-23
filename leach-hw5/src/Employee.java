/* Created by Daniel Leach */

// Employee Superclass
public abstract class Employee {
	
	// Private Member Variables
	private String name;
	private double salary;
	private String pwd;
	
	// Default Constructors
	Employee(){
		this.name = "";
		this.salary = 0;
		this.pwd = "";
	}
	
	Employee(String n, double s){
		this.name = n;
		this.salary = s;
	}
	
	// Getter Methods
	public String getName() {
		return this.name;
	}
	public double getBaseSalary() {
		return this.salary;
	}
	// Setter Method
	protected void setPW(String p) {
		if(checkPassword(p)) {
			this.pwd = p;
		}else throw new IllegalArgumentException("Illegal password :" + p);
		
	}
	// Password Match Methods
	public boolean isPasswordMatch(String s) {
		if(s.equals(pwd) && s !="") {
			return true;
		}else return false;
		
	}
	
	// Abstract Methods
	public abstract boolean checkPassword(String s); 
	public abstract double getSalary(); 

}
