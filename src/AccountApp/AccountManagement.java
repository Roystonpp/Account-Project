package AccountApp;

public class AccountManagement {

	private String firstName, lastName;
	private int accountNumber;
	
	public AccountManagement(String firstName, String lastName, int accountNumber){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	
	public void setfirstName (String firstName) {
		this.firstName = firstName;
	}
	
	public String getfirstName() { 
		return firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getaccountNumber () {
		return accountNumber;
	}

}
