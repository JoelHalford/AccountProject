import java.util.HashMap;

public class Service {

//	private ArrayList<Account> listOfAccounts = new ArrayList<Account>();
	HashMap<Integer, Account> accountList  = new HashMap<Integer, Account>();
	
	
	public void addAccount(Account account)
	{
		accountList.put(account.getAccountNumber(), account);
	}
	
	public void retrieveAccounts()
	{
		for (int i = 1; i < accountList.size()+1; i++)
		{
			System.out.println(accountList.get(i).getFirstName() + " " + accountList.get(i).getLastName());
		}
	}
}