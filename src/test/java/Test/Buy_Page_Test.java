package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.Buy_Page;


public class Buy_Page_Test extends BaseLibrary
{

	Buy_Page ob;
	
	@BeforeClass
	@Parameters({"url","browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url,browser);
		ob = new Buy_Page();
	}
	
	
	
	@Test(priority = 0)
	public void clickonBuyButton_test() throws InterruptedException 
	{
		
		ob.clickonBuyButton();
	}
	
	

	@Test(priority = 1)
	public void Buy_Pg_test() throws InterruptedException 
	{
		
		ob.Buy_Pg();
	}
	
	@Test(priority = 2)
	public void ShopBy_Brand_test() throws InterruptedException 
	{
		
		ob.ShopBy_Brand();
	}
	@Test(priority = 3)
	public void ShopBy_Category_test() throws InterruptedException 
	{
		
		ob.ShopBy_Category();
	}
	
	
	
	@Test(priority = 4)
	public void ShowMore_ShowLess_test() throws InterruptedException 
	{
		
		ob.ShowMore_ShowLess();
	}
	
	
	
	@Test(priority = 5)
	public void TopLuxuryCarMakes_test() throws InterruptedException 
	{
		
		ob.TopLuxuryCarMakes();
	}
	@Test(priority = 6)
	public void Popular_Searches_test() throws InterruptedException 
	{
		
		ob.Popular_Searches();
	}
	@Test(priority = 7)
	public void Top_Cities_test() throws InterruptedException 
	{
		
		ob.Top_Cities();
	}
	@Test(priority = 8)
	public void Top_Model_test() throws InterruptedException 
	{
		
		ob.Top_Model();
	}
	
	@Test(priority = 9)
	public void Sell_LearnMore_test() throws InterruptedException 
	{
		
		ob.Sell_LearnMore();
	}
}
