package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import baselibrary.BaseLibrary;
import page.SigninPage;

public class SignInTest extends BaseLibrary 
{
	
	SigninPage ob ;
	
	@BeforeClass
	@Parameters({"url", "browser"})
	public void getlaunhUrl(String url, String browser)
	{
		launchUrl(url,browser);
		ob = new SigninPage();
	}
	@Test(priority = 0)
	public void clickonsigninbutton() 
	{
		
		ob.clickonbutton();
	}
	
	public void signIn_Valid_Credentilas_Test() 
	{
	    ob.signIn_Valid_Credentilas();
	}
	
	
}
