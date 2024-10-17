package Test;


import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.Inquiri_With_User_LogIn;

public class Inquiri_With_User_LogIn_Test extends BaseLibrary
{

	Inquiri_With_User_LogIn ob;
	
	@BeforeClass
	@Parameters({"url","browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url, browser);
		ob=new Inquiri_With_User_LogIn();
	}
	
	@Test(priority = 0)
	public void clickonsigninbutton() 
	{
		
		ob.clickonbutton();
	}
	@Test(priority = 1)
	public void signIn_Valid_Credentilas_Test() 
	{
	    ob.signIn_Valid_Credentilas();
	}
	
	@Test(priority = 2)
	public void Browse_Dealer_Test() throws InterruptedException, AWTException 
	{
	    ob.Browse_Dealer();
	}
	
	
	@Test(priority = 3)
	public void Inquire_on_VDP_Test() throws InterruptedException 
	{
	    ob.Inquire_on_VDP();
	}
}
