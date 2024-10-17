package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.User_List_Car;


public class User_List_Car_Test extends BaseLibrary
{
	
	
	User_List_Car ob ;
	
	
	@BeforeClass
	@Parameters({"url", "browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url,browser);
		ob = new User_List_Car();
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
	public void clickOnSellButton_Test() throws InterruptedException 
	{
		ob.clickOnSellButton();
	}
	
	
	
	
	@Test(priority = 3)
	public void ClickOnMakeModel_Test() 
	{
		ob.ClickOnMakeModel();
	}
	
	
	
	
	@Test(priority = 4)
	public void Sell_Your_Car_Page_Test() 
	{
		ob.Sell_Your_Car_Page();
	}
	
	
	
	@Test(priority = 5)
	public void Select_Car_Feauture_Page_Test() 
	{
		ob.Select_Car_Feauture_Page();
	}
	
	
	
	@Test(priority = 6)
	public void Car_Conditions_Page_Test() 
	{
		ob.Car_Conditions_Page();
	}
	
	
	
	@Test(priority = 7)
	public void Contact_Information_Page_Test() 
	{
		ob.Contact_Information_Page();
	}
	
	
	
	@Test(priority = 8)
	public void Options_To_Sell_Page_Test() 
	{
		ob.Options_To_Sell_Page();
	}
	
	
	
	
	@Test(priority = 9)
	public void Priavte_Party_Value_Page_Test() 
	{
		ob.Priavte_Party_Value_Page();
	}
	
	
	@Test(priority = 10)
	public void General_Information_Page_Test() 
	{
		ob.General_Information_Page();
	}
	
	
	
	@Test(priority = 11)
	public void Step2_Page_Test() throws InterruptedException 
	{
		ob.Step2_Page();
	}
	
	
	
	@Test(priority = 12)
	public void PriceAndContact_Info_Test() throws Exception  
	{
		ob.PriceAndContact_Info();
	}
	
	
	
	@Test(priority = 13)
    public void Payment_Page_Test() throws InterruptedException 
	{
		ob.Payment_page();
	}
	
	
	@Test(priority = 14)
	public void See_Listing_Test() throws InterruptedException 
	{
		ob.See_Listing();
	}
	
	
}
