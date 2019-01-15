import com.google.gson.Gson;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world to the standard out");
		
		Account john = new Account("John", "Wayne", 1);
		Account michael = new Account("Michael", "Jackson", 3);
		
		Service newService = new Service();
		
		newService.addAccount(john);
		newService.addAccount(michael);
		
		newService.retrieveAccounts();
		
		Gson gson = new Gson();
		String json = gson.toJson(newService.accountList);
		
		System.out.println(json);
	}
}