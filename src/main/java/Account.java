
public class Account {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private static int counterID;
	private int id;
	
	
	Account(String firstName, String lastName, int accountNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		setID();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getID() {
		return this.id;
	}

	public void setID() {
		this.counterID++;
		this.id = this.counterID;		
	}
}
