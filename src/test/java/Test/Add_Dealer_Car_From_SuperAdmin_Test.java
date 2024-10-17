package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.Add_Dealer_Car_From_SuperAdmin;


public class Add_Dealer_Car_From_SuperAdmin_Test extends BaseLibrary
{

	Add_Dealer_Car_From_SuperAdmin ob;
	
	@BeforeClass
	@Parameters({"url","browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url,browser);
		ob = new Add_Dealer_Car_From_SuperAdmin();
	}
	
	@Test(priority = 0)
	public void Super_Admin_Login_Test() throws InterruptedException
	{
		ob.Login_Super_Admin();
	}
	
	@Test(priority = 1)
	public void Add_car_For_Dealer_test() throws InterruptedException
	{
		ob.Add_car_For_Dealer();
	}
	
	@Test(priority = 2)
	public void car_modifiaction_details_test() throws InterruptedException
	{
		ob.car_modifiaction_details();
	}
}
