package TestingAccount;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import AccountApp.App;
import AccountApp.HelloWorld;

public class AppTest 
{
	
	@Test
	public void test() 
	{
			
	HelloWorld test = new HelloWorld();
	assertEquals("Did not print Hello World", test.Print(), "Hello World");

	}
}
