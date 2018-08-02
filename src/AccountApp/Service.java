package AccountApp;

import java.util.HashMap;

import org.json.JSONObject;

public class Service {
	

	private HashMap<Integer, AccountManagement> hmap = new HashMap<Integer, AccountManagement>();
			
	public void addAccount(AccountManagement account) 
	{
		hmap.put(account.getaccountNumber(),account);
	}
	
	public AccountManagement getAccount(int a) 
	{
		return hmap.get(a);
	}
	
	public JSONObject MaptoJson()
	{
		return new JSONObject(hmap);
	}
	
}
