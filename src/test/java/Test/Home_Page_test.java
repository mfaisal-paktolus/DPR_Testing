package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.Home_Page;

public class Home_Page_test extends BaseLibrary
{
	Home_Page ob;
	
	@BeforeClass
	@Parameters({"url","browser"})
	public void getLaunchURL(String url, String browser)
	{
		launchUrl(url, browser);
		ob=new Home_Page();
	}

	@Test (priority = 0)
	public void Home_Test() throws InterruptedException
	{
		ob.Home();
	}
	
	
	
}
