package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class SigninPage extends BaseLibrary
{
	public SigninPage()
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
	
	
	
	public void clickonbutton() 
	{
		element_ToBe_Clickable(signinbutton); 
		
	}
	
	public void signIn_Valid_Credentilas() 
	{
		element_ToBe_Clickable(username);                                
		visibility_Of_Element(username, "mohdfaizu672@gmail.com");        
		
		element_ToBe_Clickable(password);                                
		visibility_Of_Element(password, "testabc");                      
		
		SignIn.click();
	}
	
		
	
	
	
	
	
	
}
