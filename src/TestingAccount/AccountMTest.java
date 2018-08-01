package TestingAccount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import AccountApp.AccountManagement;

public class AccountMTest {

	
	@Test
	public void testGet() {
		AccountManagement testing = new AccountManagement("RiRi", "P", 1);
		assertNotNull(testing.getfirstName()); 
		assertNotNull(testing.getlastName());
		assertNotNull(testing.getaccountNumber());
	}
	
	@Test
	public void testSet() {
		AccountManagement testing = new AccountManagement("NULL", "NULL", 1);
		testing.setfirstName("RiRi");
		assertEquals("RiRi", testing.getfirstName());
		testing.setlastName("P");
		assertEquals("P", testing.getlastName());
		testing.setaccountNumber(21);
		assertEquals(21, testing.getaccountNumber());
	}
	
}
