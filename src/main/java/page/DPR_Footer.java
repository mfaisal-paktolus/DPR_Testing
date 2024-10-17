package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class DPR_Footer extends BaseLibrary
{

	public DPR_Footer()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@class='Header_header_block__logo__VxRG3']")
	private WebElement Logo;
	
	
	@FindBy(xpath="//div[@class='Footer_footer__logo__ZPvAK']")
	private WebElement Footer_Logo;
	
	@FindBy(xpath="//a[text()='About Us']")
	private WebElement About_Us;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement Contact_Us;
	
	@FindBy(xpath="//a[text()='Contact Support']")
	private WebElement Contact_Supprt;
	
	@FindBy(xpath="//a[text()='Site Map']")
	private WebElement Site_Map;
	
	@FindBy(xpath="(//a[text()='Advertise'])[2]")
	private WebElement Advertise;
	
	@FindBy(xpath="(//a[text()='Subscribe'])[2]")
	private WebElement Subscribe;
	
	@FindBy(xpath="//a[text()='duPont REGISTRY Group']")
	private WebElement duPont_Registry;
	
	@FindBy(xpath="//a[text()='Sotheby’s Motorsport']")
	private WebElement Sotheby_Motorsport;
	
	@FindBy(xpath="//a[text()='FerrariChat']")
	private WebElement Ferrari_Chat;
	
	@FindBy(xpath="//a[text()='Canossa']")
	private WebElement Canossa;
	
	@FindBy(xpath="//a[text()='Cavallino']")
	private WebElement Cavallino;
	
	@FindBy(xpath="//a[text()='Petrolicious']")
	private WebElement Petrolicious;
	
	@FindBy(xpath="(//input[@id='email'])[2]")
	private WebElement email_2;
	
	@FindBy(xpath="//span[text()='Sign Up']")
	private WebElement Sign_up_2;
	
	
	
	
	public void Footer() throws InterruptedException
	{
        element_ToBe_Clickable(Footer_Logo);
		
	    Thread.sleep(5000);
		element_ToBe_Clickable(About_Us);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Logo);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Contact_Us);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Contact_Supprt);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Site_Map);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Logo);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Advertise);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Subscribe);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(duPont_Registry);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Sotheby_Motorsport);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Ferrari_Chat);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Canossa);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Cavallino);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Petrolicious);
		
		Thread.sleep(10000);
		changeWindow(0);
		
		visibility_Of_Element(email_2, "faisala0908@gmail.com");
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Sign_up_2);
	}
	
	
}
