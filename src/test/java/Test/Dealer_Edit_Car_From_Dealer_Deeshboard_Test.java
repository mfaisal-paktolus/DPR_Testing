package Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.Dealer_Edit_Car_From_Dealer_Deeshboard;

public class Dealer_Edit_Car_From_Dealer_Deeshboard_Test extends BaseLibrary
{

	Dealer_Edit_Car_From_Dealer_Deeshboard ob;
	
	@BeforeClass
	@Parameters({"url", "browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url,browser);
		ob = new Dealer_Edit_Car_From_Dealer_Deeshboard();
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
	public void Dealer_Deshbord_Edit_Car_test() throws InterruptedException, AWTException 
	 
	{
	    ob.Dealer_Deshbord_Edit_Car();
	}
	
	
	@Test(priority = 3)
	public void Dealer_Deshbord_Test_Remove_Car() throws InterruptedException 
	 
	{
	    ob.Dealer_Deshbord_Remove_Car();
	}
	
	
	
	@Test(priority = 4)
	public void Dealer_Deshbord_Test_Re_List_Car() throws InterruptedException 
	 
	{
	    ob.Dealer_Deshbord_Re_List_Car();
	}
}
