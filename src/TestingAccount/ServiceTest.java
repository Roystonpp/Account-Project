package TestingAccount;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;
import AccountApp.AccountManagement;
import AccountApp.Service;

public class ServiceTest 
{
	HashMap hmap;
	private AccountManagement account;
	private Service service;
	
	@Test
	public void hashTest() 
	{
	account = new AccountManagement("riri", "P",1);
	service = new Service();
	service.getAccount(1);
	assertEquals("Did not find the account", service.getAccount(1));
	
	}

}
