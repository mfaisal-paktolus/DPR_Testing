package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.Dealer_Add_Car;


public class Dealer_Add_Car_Test extends BaseLibrary
{
	Dealer_Add_Car ob;
	
	@BeforeClass
	@Parameters({"url", "browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url,browser);
		ob = new Dealer_Add_Car();
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
	public void Dealer_Deshbord_Test_Add_Car() throws InterruptedException 
	 
	{
	    ob.Dealer_Deshbord_Add_Car();
	}
	

	
}
