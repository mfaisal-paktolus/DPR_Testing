package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Inquiri_With_User_LogIn extends BaseLibrary
{

	public Inquiri_With_User_LogIn()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-test='btn-Sign In/Up']")
	private WebElement signinbutton;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement SignIn;
	
	
	
	@FindBy(xpath="//a[text()='Buy']")
	private WebElement Buy;
	
	
	@FindBy(xpath="//span[text()='Dealer Names']")
	private WebElement Dealer_drop_down;
	
	
	@FindBy(xpath="//div[text()='Search...']/ancestor::div[@class=\"Select-module_select_menu__hoWi0\"]/descendant::input")
	private WebElement Search_Dealer;
	
	@FindBy(xpath="//div[@id='213644']")
	private WebElement Car_Container;
	
	@FindBy(xpath="//button[text()='Inquire']")
	private WebElement Inquiry_button;
	
	
	public void clickonbutton() 
	{
		element_ToBe_Clickable(signinbutton);             
	}
	
	public void signIn_Valid_Credentilas() 
	{
		//element_ToBe_Clickable(username);                                
		visibility_Of_Element(username, "mohdfaizu672@gmail.com");        
		
		//element_ToBe_Clickable(password);                                
		visibility_Of_Element(password, "testabc");                      
		
		SignIn.click();
		
	}
	
	public void Browse_Dealer() throws InterruptedException, AWTException
	{
		Thread.sleep(10000);
       mouse_over_Click(Buy, "Browse Dealers");
       
       element_ToBe_Clickable(Dealer_drop_down);
       
       Thread.sleep(10000);
       
       visibility_Of_Element(Search_Dealer, "test");
       
       Thread.sleep(5000);
       
       Robot robot= new Robot();
		
	   robot.keyPress(KeyEvent.VK_ENTER);
		
	   robot.keyRelease(KeyEvent.VK_ENTER);
       
	}
	
	
	
	
	public void Inquire_on_VDP() throws InterruptedException
	{
		element_ToBe_Clickable(Car_Container);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Inquiry_button);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
