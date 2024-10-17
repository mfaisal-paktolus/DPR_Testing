package Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.Edit_Dealer_Car_From_SuperAdmin;

public class Edit_Dealer_Car_From_SuperAdmin_Test extends BaseLibrary
{
	Edit_Dealer_Car_From_SuperAdmin ob;
	
	@BeforeClass
	@Parameters({"url","browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url,browser);
		ob = new Edit_Dealer_Car_From_SuperAdmin();
	}
	
	@Test(priority = 1)
	public void Super_Admin_Login_Test() throws InterruptedException
	{
		ob.Login_Super_Admin();
	}
	
	@Test(priority = 2)
	public void SearChcar_Test() throws InterruptedException, AWTException
	{
		ob.SearchCar();
	}

	@Test(priority = 3)
	public void Edit_Car_Details() throws InterruptedException
	{
		ob.Edit_Car_Details();
	}
	
	@Test(priority = 4)
	public void Edit_Modification_details_Test() throws InterruptedException
	{
		ob.Edit_Modification_details();
	}
}
