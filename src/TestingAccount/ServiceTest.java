package TestingAccount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import org.junit.Test;
import AccountApp.AccountManagement;
import AccountApp.Service;

public class ServiceTest 
{
	HashMap hmap;
	public AccountManagement account;
	public Service service;
	 
	@Test
	public void hashTest() 
	{
	account = new AccountManagement("riri", "P",1);
	service = new Service();
	service.getAccount(1);
	assertEquals("Did not find the account", service.getAccount(1));
	}
	
	@Test
	public void  jsonTest() 
	{
		Service s = new Service();
		AccountManagement r = new AccountManagement("Royston", "Pinnock",10);
		s.addAccount(r);
		
		HashMap<Integer, AccountManagement> hmap = new HashMap<Integer, AccountManagement>();
		hmap.put(10, new AccountManagement("Royston", "Pinnock",10));
        assertNotNull("Account is Null", s.MaptoJson());
	}
	
	@Test
	public void IterTest()
	{
		Service s = new Service();
		AccountManagement r = new AccountManagement("Royston", "Pinnock",10);
		s.addAccount(r);
		assertEquals("This was not expected",s.Itername("Royston") , 1);
	}

}
