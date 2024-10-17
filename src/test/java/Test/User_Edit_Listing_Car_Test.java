package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.User_Edit_Listing_Car;

public class User_Edit_Listing_Car_Test extends BaseLibrary
{

	User_Edit_Listing_Car ob;
	
	@BeforeClass
	@Parameters({"url", "browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url,browser);
		ob = new User_Edit_Listing_Car();
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
	public void See_Listing_Test() throws InterruptedException 
	{
		ob.See_Listing();
	}
	
	
	
	@Test(priority = 3)
	public void Edit_Listing_Car_Test() throws InterruptedException 
	{
		ob.Edit_Listing_Car();
	}
	
	
	
	@Test(priority = 4)
	public void Remove_Car_Test() throws InterruptedException 
	{
		ob.Remove_Car();
	}
}
