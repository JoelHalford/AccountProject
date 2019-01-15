import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
	
	@Test
	public void createAccount() {
		
		Account john = new Account("John", "Wayne", 1);
		Account michael = new Account("Michael", "Jackson", 3);

		
		assertEquals(john.getAccountNumber(), 1);
		assertEquals(john.getLastName(), "Wayne");
		assertEquals(michael.getAccountNumber(), 3);
		assertEquals(michael.getLastName(), "Jackson");
	}
	
	@Test
	public void retrieveAccounts() {
		
		Account john = new Account("John", "Wayne", 1);
		Account michael = new Account("Michael", "Jackson", 3);
		
		Service newService = new Service();
		
		newService.addAccount(john);
		newService.addAccount(michael);
		
		assertEquals(newService.accountList.size(), 2);
	}
}
