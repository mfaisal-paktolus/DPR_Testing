package page;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class User_Edit_Listing_Car extends BaseLibrary
{
	//path="C:\\Users\\MohammedFaisal\\OneDrive - Paktolus Solutions - HigherL LLC\\Desktop\\DPRTest\\Test_Data\\imag1.jpg";
     public User_Edit_Listing_Car()
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
 	
 	
 	
 	
 	
 	@FindBy(xpath="//span[text()='Account']")
 	private WebElement Account;
 	
 	@FindBy(xpath="//span[text()='My Listings']")
	private WebElement My_Listing;
 	
 	
 	
 	
 	@FindBy(xpath="(//button[@class='LilCards-module_favourite__YtjN9 undefined'])[1]")
	private WebElement Edit_Car_Button;
 	
 	
 	
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement Year;
	
	@FindBy(xpath="//input[@id='mileage']")
	private WebElement Mileage;
	
	@FindBy(xpath="//span[text()='Diesel']")
	private WebElement Select_Engine_Type;
	
	@FindBy(xpath="//div[@data-test='Number of Cylinders']")
	private WebElement Number_Of_Cylinders ;
	
	@FindBy(xpath="//span[text()='5']")
	private WebElement Select_Number_Of_Cylinders;
	
	@FindBy(xpath="//input[@id='workingVolume']")
	private WebElement Working_Volume_N;
	
	@FindBy(xpath="//input[@id='powerAtRPM']")
	private WebElement Power_AtRPM;
	
	@FindBy(xpath="//span[text()='Automatic']")
	private WebElement Transmission;
	
	@FindBy(xpath="//span[text()='Rwd (rear-wheel drive)']")
	private WebElement Drive_Train;
	
	@FindBy(xpath="//span[text()='Sedan long']")
	private WebElement Body_Style;
	
	@FindBy(xpath="//input[@id='transmissionSpeed']")
	private WebElement tranmission_speed;
	
	@FindBy(xpath="//input[@id='passengerCapacity']")
	private WebElement passaanger_capacity;
	
	@FindBy(xpath="//input[@id='engineBlockType']")
	private WebElement engine_block_type;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement description;
	
	
	
	
	@FindBy(xpath="(//li[@title='Blue'])[1]")
	private WebElement Exterior_Color;
	
	@FindBy(xpath="(//li[@title='Black'])[2]")
	private WebElement Interior_Color;
	
	
	@FindBy(xpath="//div[@data-test='uploader-container']")
	private WebElement Chose_photo;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement Save_Edit;
	
	
	@FindBy(xpath="(//div[@class='LilCards-module_product_wrapper__FkNih '])[3]")
	private WebElement Click_On_Car;
	
	@FindBy(xpath="//button[text()='Withdraw Listing']")
	private WebElement Remove_Car;
 	
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
	
	public void See_Listing() throws InterruptedException
	{
		element_ToBe_Clickable(Account);
		
		element_ToBe_Clickable(My_Listing);
	}
	
	
	
	public void Edit_Listing_Car() throws InterruptedException
	{
		Thread.sleep(10000);
		element_ToBe_Clickable(Edit_Car_Button);
	
		Thread.sleep(5000);
		Year.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Year, "2020"); 
		
		      
		Thread.sleep(2000);
		Mileage.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Mileage, "321");  
		
        element_ToBe_Clickable(Select_Engine_Type);
		
		element_ToBe_Clickable(Number_Of_Cylinders);

		element_ToBe_Clickable(Select_Number_Of_Cylinders);
		
		Thread.sleep(2000);
		Working_Volume_N.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Working_Volume_N, "3");
		
		
		Thread.sleep(2000);
		Power_AtRPM.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Power_AtRPM, "3");
		
		element_ToBe_Clickable(Transmission);
		
		element_ToBe_Clickable(Drive_Train);
		
		element_ToBe_Clickable(Body_Style);
		
		
		Thread.sleep(2000);
		tranmission_speed.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(tranmission_speed, "300");
		
		
		Thread.sleep(2000);
		passaanger_capacity.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(passaanger_capacity, "7");
		
		
		Thread.sleep(2000);
		engine_block_type.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(engine_block_type, "Deasel");
		                            
		
		element_ToBe_Clickable(Exterior_Color);                   
		
		element_ToBe_Clickable(Interior_Color);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Chose_photo);
		
		Thread.sleep(2000);
		
		choose_file("C:\\Users\\MohammedFaisal\\OneDrive - Paktolus Solutions - HigherL LLC\\Desktop\\DPRTest\\Test_Data\\imag1.jpg");
		
		//element_ToBe_Clickable(Save_Edit);
	}
	
	public void Remove_Car() throws InterruptedException
	{
		Thread.sleep(10000);
		element_ToBe_Clickable(Click_On_Car);
		
		element_ToBe_Clickable(Remove_Car);
	}
}
