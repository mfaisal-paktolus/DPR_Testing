package page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baselibrary.BaseLibrary;


public class User_List_Car extends BaseLibrary
{

	public User_List_Car()
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
	
	
	
	
	
	@FindBy(xpath="//a[@href='/sell']")
	private WebElement ClickOnSellButton;
	
	@FindBy(xpath="//button[@id='simple-tab-2']")
	private WebElement ClickOnMakeModel;
	
	@FindBy(xpath="//input[@id='make']")
	private WebElement Make;
	
	@FindBy(xpath="//li[@id='make-option-1']")
	private WebElement Select_Make;
	
	@FindBy(xpath="//input[@id='model']")
	private WebElement Model;
	
	@FindBy(xpath="//li[text()='80']")
	private WebElement Select_Model;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement Year;
	
	@FindBy(xpath="//li[text()='2023']")
	private WebElement Select_Year;
	
	@FindBy(xpath="//input[@id='zipcode']")
	private WebElement ZipCode;
	
	@FindBy(xpath="//button[@id='sell_new_lookup_make_model']")
	private WebElement Lets_Get_Started;
	
	
	
	
	
	
	@FindBy(xpath="//button[@id='sell_new_car_features']")
	private WebElement Next;
	
	@FindBy(xpath="(//div[@style='margin-bottom: 10px;'])[4]")
	private WebElement Car_Condition;
	
	@FindBy(xpath="//input[@id='mileage']")
	private WebElement Mileage;
	
	@FindBy(xpath="//button[@id='sell_new_car_conditions']")
	private WebElement Next2;
	
	
	
	
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement First_Name;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement Last_Name;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement Phone_Num;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email_ADD;
	
	@FindBy(xpath="//button[@id='sell_new_user_contact']")
	private WebElement Next3;
	
	
	
	
	
	@FindBy(xpath="//p[text()='List Privately Yourself']")
	private WebElement Option_to_Sell;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit_Button;
	
	
	
	
	
	@FindBy(xpath="//button[@id='sell_new_done']")
	private WebElement Click_Here_To_Complete_Posting;
	
	
	
	
	@FindBy(xpath="//div[@data-test='Model']")
	private WebElement Model2;
	
	@FindBy(xpath="//span[text()='80']")
	private WebElement Select_Model_2;
	
	
	
	
	@FindBy(xpath="//span[text()='Hybrid']")
	private WebElement Select_Engine_Type;
	
	@FindBy(xpath="//div[@data-test='Number of Cylinders']")
	private WebElement Number_Of_Cylinders ;
	
	@FindBy(xpath="//span[text()='2']")
	private WebElement Select_Number_Of_Cylinders;
	
	@FindBy(xpath="//input[@id='workingVolume']")
	private WebElement Working_Volume_N;
	
	@FindBy(xpath="//input[@id='powerAtRPM']")
	private WebElement Power_AtRPM;
	
	@FindBy(xpath="//span[text()='Manual']")
	private WebElement Transmission;
	
	@FindBy(xpath="//span[text()='Fwd (front-wheel drive)']")
	private WebElement Drive_Train;
	
	@FindBy(xpath="//span[text()='Sedan']")
	private WebElement Body_Style;
	
	@FindBy(xpath="//input[@id='transmissionSpeed']")
	private WebElement tranmission_speed;
	
	@FindBy(xpath="//input[@id='passengerCapacity']")
	private WebElement passaanger_capacity;
	
	@FindBy(xpath="//input[@id='engineBlockType']")
	private WebElement engine_block_type;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement description;
	
	
	@FindBy(xpath="//button[text()='To Step 2']")
	private WebElement To_Step2_Button;
	
	
	
	
	@FindBy(xpath="(//li[@title='Black'])[1]")
	private WebElement Exterior_Color;
	
	@FindBy(xpath="(//li[@title='White'])[2]")
	private WebElement Interior_Color;
	
	@FindBy(xpath="//div[@data-test='uploader-container']")
	private WebElement Chose_photo;
	
	
	
	@FindBy(xpath="//button[text()='To Step 3']")
	private WebElement To_Step3_Button;
	
	
	
	
	@FindBy(xpath="//input[@id='address']")
	private WebElement Location_Zip_Code;
	
	@FindBy(xpath="(//div[@class='pac-item'])[1]")
	private WebElement Select_Location_Zip_Code;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement Phone_Number_2;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submit;
	
	
	
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='cardNumber']")
	private WebElement Card_Number;
	
	@FindBy(xpath="//input[@id='cardExpiry']")
	private WebElement Expiry_date;
	
	@FindBy(xpath="//input[@id='cardCvc']")
	private WebElement CVV_Number;
	
	@FindBy(xpath="//input[@id='billingName']")
	private WebElement Card_Holder_Name;
	
	@FindBy(xpath="//button[@class='SubmitButton SubmitButton--complete']")
	private WebElement PAY_Button;
	
	
	
	
	@FindBy(xpath="//button[text()='See My Listings']")
	private WebElement See_My_Listing;
	
	@FindBy(xpath="//span[text()='My Listings']")
	private WebElement My_Listing;
	
	
	
	
	
	
	
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
	
	
	
	
	public void clickOnSellButton() throws InterruptedException 
	{
		Thread.sleep(10000);
		element_ToBe_Clickable(ClickOnSellButton);
	}
	
	
	
	public void ClickOnMakeModel() 
	{
		element_ToBe_Clickable(ClickOnMakeModel);
	}
	
	
	
	public void Sell_Your_Car_Page()
	{
		element_ToBe_Clickable(Make);
		element_ToBe_Clickable(Select_Make);
		
		element_ToBe_Clickable(Model);
		element_ToBe_Clickable(Select_Model);
		
		element_ToBe_Clickable(Year);
		element_ToBe_Clickable(Select_Year);
		
		element_ToBe_Clickable(ZipCode);
		visibility_Of_Element(ZipCode, "21332");
		
		element_ToBe_Clickable(Lets_Get_Started);
		
	}
	
	
	
	public void Select_Car_Feauture_Page()
	{
		element_ToBe_Clickable(Next);
	}
	
	
	
	
	public void Car_Conditions_Page()
	{
		element_ToBe_Clickable(Car_Condition);
		

		visibility_Of_Element(Mileage, "123");
		
		element_ToBe_Clickable(Next2);	
	}
	
	
	
	
	public void Contact_Information_Page()
	{
		
		visibility_Of_Element(First_Name, "Faisal");
		
		visibility_Of_Element(Last_Name, "123");
		
		visibility_Of_Element(Phone_Num, "123245262");
		
		visibility_Of_Element(Email_ADD, "mohdfaizu672@gmail.com");
		
		element_ToBe_Clickable(Next3);
	}
	
	
	
	
    public void Options_To_Sell_Page()
    {
    	element_ToBe_Clickable(Option_to_Sell);
    	
    	element_ToBe_Clickable(Submit_Button);
    }
	
    
    
	public void Priavte_Party_Value_Page()
	{
		
		element_ToBe_Clickable(Click_Here_To_Complete_Posting);
	}
	
	
	
	public void General_Information_Page()
	{

		element_ToBe_Clickable(Model2);
		element_ToBe_Clickable(Select_Model_2);
		
		element_ToBe_Clickable(Select_Engine_Type);
		
		element_ToBe_Clickable(Number_Of_Cylinders);
		element_ToBe_Clickable(Select_Number_Of_Cylinders);
		
		visibility_Of_Element(Working_Volume_N, "2");
		
		visibility_Of_Element(Power_AtRPM, "2");
		
		element_ToBe_Clickable(Transmission);
		
		element_ToBe_Clickable(Drive_Train);
		
		element_ToBe_Clickable(Body_Style);
		
		visibility_Of_Element(tranmission_speed, "200");
		
		visibility_Of_Element(passaanger_capacity, "5");
		
		visibility_Of_Element(engine_block_type, "ptrol");
		
		visibility_Of_Element(description, "Testing");
		
		element_ToBe_Clickable(To_Step2_Button);
	}
	
	
	
	public void Step2_Page() throws InterruptedException
	{
		element_ToBe_Clickable(Exterior_Color);
		
		element_ToBe_Clickable(Interior_Color);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Chose_photo);
		
        Thread.sleep(2000);
		
		choose_file("C:\\Users\\MohammedFaisal\\OneDrive - Paktolus Solutions - HigherL LLC\\Desktop\\DPRTest\\Test_Data\\imag1.jpg");
		
		element_ToBe_Clickable(To_Step3_Button);																												
	}
	
	
	
	public void PriceAndContact_Info() throws Exception  
	{
		
		
		visibility_Of_Element(Location_Zip_Code, "34"); 
		
		Thread.sleep(5000);
		
		Robot robot= new Robot();
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyRelease(KeyEvent.VK_SPACE);
		
	    
		element_ToBe_Clickable(Select_Location_Zip_Code);
		
	    
	    //element_ToBe_Clickable(Submit);
		
	}

	public void Payment_page() throws InterruptedException
	{
		
		
		
		visibility_Of_Element(Email, "mohdfaizu672@gmail.com");
		
		
		visibility_Of_Element(Card_Number, "4242424242424242");
		
		
		visibility_Of_Element(Expiry_date, "1225");
		
		
		visibility_Of_Element(CVV_Number, "123");
		
		
		visibility_Of_Element(Card_Holder_Name, "ABC");
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", PAY_Button);
	    executor.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
	    
	    
	    
		element_ToBe_Clickable(PAY_Button);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}
	
	public void See_Listing() throws InterruptedException
	{
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		element_ToBe_Clickable(See_My_Listing);
		
		element_ToBe_Clickable(My_Listing);
	}
	
	
	
	
}
