import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
	
	@Test
	public void createAccount() {
		
		Account john = new Account("John", "Wayne", 1);
		Account michael = new Account("Michael", "Jackson", 3);

		
		assertEquals(john.getAccountNumber(), 1);
		assertEquals(john.getLastName(), "Wayne");
		assertEquals(michael.getLastName(), "Jackson");
	}
	
	@Test
	public void retrieveAccounts() {
		
		Account john = new Account("John", "Wayne", 1);
		Account michael = new Account("Michael", "Jackson", 3);
		
		Service newService = new Service();
		
		newService.addAccount(john);
		newService.addAccount(michael);
		
		assertEquals(newService.retrieveAccounts().size(), 2);
	}
	
	@Test
	public void searchName() {
		
		Account john = new Account("John", "Wayne", 1);
		Account michael = new Account("Michael", "Jackson", 2);
		Account john2 = new Account("John", "Blade", 3);
		Account dave = new Account("Dave", "Jackson", 4);
		Account john3 = new Account("John", "Daniels", 5);	
		
		Service newService = new Service();
		
		newService.addAccount(john);
		newService.addAccount(michael);
		newService.addAccount(john2);
		newService.addAccount(dave);
		newService.addAccount(john3);
		
		assertEquals(3, newService.countDupes("John"));
	}
	
	@Test
	public void setName() {
		Account john = new Account("John", "Wayne", 1);
		
		john.setFirstName("Josh");
		
		assertEquals("Josh", john.getFirstName());		
	}
	
	@Test
	public void setLastName() {
		Account john = new Account("John", "Wayne", 1);
		
		john.setLastName("Halford");
		
		assertEquals("Halford", john.getLastName());		
	}
	
	@Test
	public void setAccountNumber() {
		Account john = new Account("John", "Wayne", 1);
		
		john.setAccountNumber(3);
		
		assertEquals(3, john.getAccountNumber());		
	}
}
