package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.DPR_Header;

public class DPR_Header_Test extends BaseLibrary
{

	DPR_Header ob;
	
	@BeforeClass
	@Parameters({"url","browser"})
	public void getLaunchURL(String url, String browser)
	{
		launchUrl(url, browser);
		ob= new DPR_Header();
	}
	
	
//	@Test(priority = 0)
//	public void Buy_Menu_Test() throws InterruptedException
//	{
//		ob.Buy_Menu();
//	}
	
	
//	@Test(priority = 1)
//	public void Sell_Menu_Test() throws InterruptedException
//	{
//		ob.Sell_Menu();
//	}
	
	@Test(priority = 2)
	public void Head_Test() throws InterruptedException
	{
		ob.Header();
	}
	
}
