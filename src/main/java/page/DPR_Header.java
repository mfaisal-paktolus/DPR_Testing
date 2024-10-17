package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class DPR_Header extends BaseLibrary 
{

	public DPR_Header()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[text()='Buy']")
	private WebElement Buy;
	
	@FindBy(xpath="//div[@class='Header_header_block__logo__VxRG3']")
	private WebElement Logo;
	
	@FindBy(xpath="//a[text()='Sell']")
	private WebElement Sell;
	
	@FindBy(xpath = "//a[text()='Finance']")
	private WebElement Finance;
	
	@FindBy(xpath="//a[text()='Insure']")
	private WebElement Insure;
	
	@FindBy(xpath="//a[text()='Protect']")
	private WebElement Protect;
	
	@FindBy(xpath="//a[text()='Ship']")
	private WebElement Ship;
	
	@FindBy(xpath="//button[text()='Agree and Continue']")
	private WebElement Agree;
	
	@FindBy(xpath="//a[text()='News']")
	private WebElement News;
	
	@FindBy(xpath="//button[text()='Sign In/Up']")
	private WebElement Signin_In_Up;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement user_name;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement Sign_In;
	
	@FindBy(xpath="//a[@href='/favorites']")
	private WebElement Saved_Product;
	
	@FindBy(xpath="//a[@href='/recent-searches']")
	private WebElement Saved_Searches;
	
	@FindBy(xpath="//span[text()='Account']")
	private WebElement Acount;
	
	@FindBy(xpath="(//a[text()='See All'])[1]")
	private WebElement SeeAll_Products;
	
	@FindBy(xpath="(//a[text()='See All'])[2]")
	private WebElement SeeAll_Seacrhes;
	
	@FindBy(xpath="//button[@aria-label='close']")
	private WebElement X_Button;
	
	
	

	
	public void Buy_Menu() throws InterruptedException
	{
		element_ToBe_Clickable(Buy);
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
	    mouse_over_Click(Buy, "Cars");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Ferrari");
		Thread.sleep(50000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Lamborghini");
		Thread.sleep(50000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Porsche");
		Thread.sleep(50000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Rolls Royce");
		Thread.sleep(50000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "McLaren");
		Thread.sleep(50000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Browse All Cars");
		Thread.sleep(50000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Browse Dealers");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Discover");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Watches");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Real Estate");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Marine");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
		
		mouse_over_Click(Buy, "Other");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(2000);
	}
	
	public void Sell_Menu() throws InterruptedException
	{
		element_ToBe_Clickable(Sell);
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(10000);
		
		mouse_over_Click(Sell, "Get a Cash Offer");
		Thread.sleep(10000);
		
		changeWindow(0);
		Thread.sleep(10000);
		
		mouse_over_Click(Sell, "List Your Car");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(10000);
		
		mouse_over_Click(Sell, "Dealers Sign In");
		Thread.sleep(10000);
		
		element_ToBe_Clickable(X_Button);
		Thread.sleep(10000);
		
		mouse_over_Click(Sell, "Advertise");
		Thread.sleep(10000);
		
		changeWindow(0);
		Thread.sleep(10000);	
	}
	
	public void Header() throws InterruptedException
	{
//		element_ToBe_Clickable(Finance);
//		Thread.sleep(10000);
//		
//		element_ToBe_Clickable(Logo);
//		Thread.sleep(10000);
//		
//		element_ToBe_Clickable(Insure);
//		Thread.sleep(10000);
//		
//		driver.navigate().back();
//		Thread.sleep(10000);
//		
//		element_ToBe_Clickable(Protect);
//		Thread.sleep(10000);
//		
//		element_ToBe_Clickable(Logo);
//		Thread.sleep(10000);
//		
//		element_ToBe_Clickable(Ship);
//		Thread.sleep(10000);
//		
//		element_ToBe_Clickable(Agree);
//		Thread.sleep(10000);
//		
//		element_ToBe_Clickable(Logo);
//		Thread.sleep(10000);
//		
//		element_ToBe_Clickable(News);
//		Thread.sleep(10000);
//		
//		changeWindow(0);
//		Thread.sleep(10000);
		
		element_ToBe_Clickable(Signin_In_Up);
		Thread.sleep(5000);
		
		visibility_Of_Element(user_name, "mfaisal6720@gmail.com");
		
		visibility_Of_Element(password, "testabc");
		
		element_ToBe_Clickable(Sign_In);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Saved_Product);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Logo);
		
		Thread.sleep(10000);
		mouse_over_Click(Saved_Product, "2024 Bugatti Chiron");
		
//		Thread.sleep(5000);
//		element_ToBe_Clickable(Logo);
//		
//		Thread.sleep(5000);
//		element_ToBe_Clickable(Saved_Searches);
//		
//		Thread.sleep(5000);
//		element_ToBe_Clickable(Logo);
//		
//		mouse_over_Click(Saved_Searches, "Ferrari");
//		
//		Thread.sleep(5000);
//		element_ToBe_Clickable(Logo);
//		
//		Thread.sleep(5000);
//		element_ToBe_Clickable(Acount);
//		
//		Thread.sleep(5000);
//		element_ToBe_Clickable(Logo);
		
	}
	
}
