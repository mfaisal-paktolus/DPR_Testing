package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baselibrary.BaseLibrary;

public class Buy_Page extends BaseLibrary
{

	public Buy_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//button[text()='Buy a car']")
	private WebElement ClickBuyButton;
	
	@FindBy(xpath="//div[text()='All Makes']")
	private WebElement Make;
	
	@FindBy(xpath="//div[@id='react-select-2-option-0-0']")
	private WebElement Select_Make;
	
	@FindBy(xpath="//div[text()='All Models']")
	private WebElement Model;
	
	@FindBy(xpath="//div[@id='react-select-3-option-0-2']")
	private WebElement Select_Model;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement Search_Button;
	
	
	@FindBy(xpath="//span[text()='Aston Martin']")
	private WebElement ShopBy_Brand;
	
	@FindBy(xpath="//a[text()='Sports']")
	private WebElement ShopBy_Category;
	
	
	@FindBy(xpath ="//div[text()='Show More']")
	private WebElement ShowMore_Button;
	
	@FindBy(xpath ="//div[text()='Show Less']")
	private WebElement ShowLess_Button;
	
	@FindBy(xpath="//a[text()='Dodge']")
	private WebElement TopLuxuryCarMakes;
	
	@FindBy(xpath="//a[text()='Porsche 911 Turbo S']")
	private WebElement Popular_Searches;
	
	@FindBy(xpath="//a[text()='Las Vegas, NV']")
	private WebElement Top_Cities;
	
	@FindBy(xpath="(//a[text()='Lamborghini Urus'])[2]")
	private WebElement Top_Model;
	
	
	@FindBy(xpath="//a[text()='Learn More']")
	private WebElement Sell_LearnMore_Button;
	
	
	
	public void clickonBuyButton() throws InterruptedException 
	{
		Thread.sleep(5000);
		element_ToBe_Clickable(ClickBuyButton);
		Thread.sleep(5000);
	}
	
	public void Buy_Pg() throws InterruptedException 
	{
		element_ToBe_Clickable(Make);
		element_ToBe_Clickable(Select_Make);
		
		element_ToBe_Clickable(Model);
		element_ToBe_Clickable(Select_Model);
		
		Search_Button.click();
		
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);	
		
	}
	
	public void ShopBy_Brand() throws InterruptedException
	{
        element_ToBe_Clickable(ShopBy_Brand);
		
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public void ShopBy_Category() throws InterruptedException
	{
		element_ToBe_Clickable(ShopBy_Category);
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public void ShowMore_ShowLess() throws InterruptedException
	{
		element_ToBe_Clickable(ShowMore_Button);
		Thread.sleep(5000);
		element_ToBe_Clickable(ShowLess_Button);
		Thread.sleep(5000);
		
	}
	
	
	public void TopLuxuryCarMakes() throws InterruptedException
	{
		element_ToBe_Clickable(TopLuxuryCarMakes);
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public void Popular_Searches() throws InterruptedException
	{
		element_ToBe_Clickable(Popular_Searches);
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public void Top_Cities() throws InterruptedException
	{
		element_ToBe_Clickable(Top_Cities);
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public void Top_Model() throws InterruptedException
	{
		element_ToBe_Clickable(Top_Model);
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public void Sell_LearnMore() throws InterruptedException
	{
		
		element_ToBe_Clickable(Sell_LearnMore_Button);
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
}
