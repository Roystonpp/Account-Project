package AccountApp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.json.JSONObject;

public class Service {
	

	private HashMap<Integer, AccountManagement> hmap = new HashMap<Integer, AccountManagement>();
	int firstname;		
	
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
	
	public int Itername(String firstName) 
	{
	
	//Iterator<Entry<Integer, AccountManagement>> it = hmap.entrySet() .iterator();
	
    int count = 0;
	
	for(AccountManagement account : hmap.values())
	  { if (account.getfirstName().equals(firstName))
		  count++;
	  }
	return count; 
	
	}
	
		
}
