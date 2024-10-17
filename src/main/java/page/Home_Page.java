package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Home_Page extends BaseLibrary
{

	public Home_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@class='Header_header_block__logo__VxRG3']")
	private WebElement Logo;
	
	@FindBy(xpath="//button[text()='Buy a car']")
	private WebElement Buy_a_car;
	
	@FindBy(xpath="//button[text()='Sell a car']")
	private WebElement Sell_a_car;
	
	@FindBy(xpath="//div[text()='All Makes']")
	private WebElement All_Makes;
	
	@FindBy(xpath="//div[@id='react-select-2-option-0-0']")
	private WebElement Select_Make;
	
	@FindBy(xpath="//div[text()='All Models']")
	private WebElement All_Model;
	
	@FindBy(xpath="//div[@id='react-select-3-option-0-2']")
	private WebElement Select_Model;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement Search;
	
	@FindBy(xpath="(//img[@alt='Lamborghini'])[1]")
	private WebElement Brand_Logo;
	
	@FindBy(xpath="//a[text()='Shop Now']")
	private WebElement Shop_now_Aprroved_srp;
	
	@FindBy(xpath="//span[text()='Aston Martin']")
	private WebElement Shop_by_brand;
	
	@FindBy(xpath="//a[text()='Audi']")
	private WebElement Popular_Brand;
	
	@FindBy(xpath="//div[text()='Get Your Offer']")
	private WebElement Get_your_offer;
	
	@FindBy(xpath="(//a[text()='Explore all '])[1]")
	private WebElement Feature_explore_more;
	
	@FindBy(xpath="//div[@class='StoryItems_stories_blog_item__BYvRb']")
	private WebElement Feature_any_car;
	
	@FindBy(xpath="(//a[text()='Explore all '])[2]")
	private WebElement Exclusive_review_explore_all;
	
	@FindBy(xpath="/html/body/div[7]/div/main/div/div[2]/div/div/div/div/div/div[9]/div[2]/div[1]/a")
	private WebElement exclusive_any_car;
	
	@FindBy(xpath="//div[text()='Get an Offer']")
	private WebElement Get_an_offer;
	
	@FindBy(xpath="//div[text()='Get a Quote']")
	private WebElement Get_a_Quote;
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	private WebElement Subscribe_Email;
	
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement Submit;
	

	
	
	
	public void Home() throws InterruptedException
	{
		element_ToBe_Clickable(Buy_a_car);
		Thread.sleep(5000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Sell_a_car);
		Thread.sleep(5000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(10000);
		
		element_ToBe_Clickable(All_Makes);
		
		element_ToBe_Clickable(Select_Make);
		
		element_ToBe_Clickable(All_Model);
		
		element_ToBe_Clickable(Select_Model);
		
		element_ToBe_Clickable(Search);
		
		Thread.sleep(20000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(5000);
		
		//element_ToBe_Clickable(Brand_Logo);
		
		element_ToBe_Clickable(Shop_now_Aprroved_srp);
		Thread.sleep(20000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(5000);
		
		element_ToBe_Clickable(Shop_by_brand);
		Thread.sleep(20000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(5000);
		
		element_ToBe_Clickable(Popular_Brand);
		Thread.sleep(20000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(5000);
		
		element_ToBe_Clickable(Get_your_offer);
		Thread.sleep(10000);
		
		element_ToBe_Clickable(Logo);
		Thread.sleep(5000);
		
		element_ToBe_Clickable(Feature_explore_more);
		Thread.sleep(10000);
		
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Feature_any_car);
		Thread.sleep(10000);
		
		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Exclusive_review_explore_all);
		Thread.sleep(10000);
		
		changeWindow(0);
		
//		Thread.sleep(5000);
//		element_ToBe_Clickable(exclusive_any_car);
//		Thread.sleep(10000);
//		
//		changeWindow(0);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Get_an_offer);
		Thread.sleep(10000);
		
		changeWindow(0);
		Thread.sleep(5000);
		
		element_ToBe_Clickable(Get_a_Quote);
		Thread.sleep(10000);
		
		changeWindow(0);
		
		Thread.sleep(5000);
		visibility_Of_Element(Subscribe_Email, "faisala0908@gmail.com");
		Thread.sleep(5000);
		
		element_ToBe_Clickable(Submit);
	}
	
	
}
