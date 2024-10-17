package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import page.DPR_Footer;



public class DPR_Footer_Test extends BaseLibrary
{

	DPR_Footer ob;
	
	@BeforeClass
	@Parameters({"url","browser"})
	public void getLaunchURL(String url, String browser)
	{
		launchUrl(url, browser);
		ob=new DPR_Footer();
	}
	
	@Test(priority = 0)
	public void Footer_Test() throws InterruptedException
	{
		ob.Footer();
	}
	
}
