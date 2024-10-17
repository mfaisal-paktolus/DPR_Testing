package page;

import java.awt.AWTException;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import baselibrary.BaseLibrary;

public class Dealer_Edit_Car_From_Dealer_Deeshboard extends BaseLibrary
{

	public Dealer_Edit_Car_From_Dealer_Deeshboard()
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
	
	@FindBy(xpath="//span[text()='Dealer Dashboard']/ancestor::a")
	private WebElement DealerDeshbord;
	
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	private WebElement Edit_Button;
	
	@FindBy(xpath="//div[@data-test='Condition']")
	private WebElement Condition;
	
	@FindBy(xpath="//span[text()='Used']")
	private WebElement Condition_Used;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement Year;
	
	@FindBy(xpath="//input[@id=\'mileage\']")
	private WebElement Mileage;
	
	@FindBy(xpath="//span[text()='Diesel']")
	private WebElement Engine_Type;
	
	@FindBy(xpath="(//div[@id='test'])[4]")
	private WebElement No_OFCylinder;
	
	@FindBy(xpath="//span[text()='3']")
	private WebElement Select_Cylinder;
	
	@FindBy(xpath="//input[@id='workingVolume']")
	private WebElement VolumeL;
	
	@FindBy(xpath="//input[@id='powerAtRPM']")
	private WebElement PowerRTM;
	
	
	@FindBy(xpath="//span[text()='Automatic']")
	private WebElement Transmission;
	
	
	
	@FindBy(xpath="//span[text()='Rwd (rear-wheel drive)']")
	private WebElement Drive_Train;
	
	@FindBy(xpath="//span[text()='Sedan long']")
	private WebElement Body_Style;
	
	@FindBy(xpath="//input[@id='transmissionSpeed']")
	private WebElement Transmission_speed;
	
	@FindBy(xpath="//input[@id='passengerCapacity']")
	private WebElement Passanger_capacity;
	
	@FindBy(xpath="//input[@id='engineBlockType']")
	private WebElement Engine_block_Type;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement Description;
	
	@FindBy(xpath="(//li[@title='Blue'])[1]")
	private WebElement Exteriar_Color;
	
	@FindBy(xpath="(//li[@title='Blue'])[2]")
	private WebElement Interiar_Color;
	
	@FindBy(xpath="//div[@data-test='uploader-container']")
	private WebElement Chose_photo;
	
	@FindBy(xpath="//div[@data-test='check-container']")
	private WebElement CallForPrice;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement Save_Button;
	
	@FindBy(xpath="(//button[text()='Remove'])[1]")
	private WebElement Remove_Button;
	
	@FindBy(xpath="(//button[text()='Re-List'])[1]")
	private WebElement ReList;
	
	
	public void clickonbutton() 
	{
		element_ToBe_Clickable(signinbutton);
	}
	
	
	public void signIn_Valid_Credentilas() 
	{
		element_ToBe_Clickable(username);                         
		visibility_Of_Element(username, "faizu9548@gmail.com");   
		
		element_ToBe_Clickable(password);                         
		visibility_Of_Element(password, "testabc");               
		
		element_ToBe_Clickable(SignIn);                           
	}
	
	public void Dealer_Deshbord_Edit_Car() throws InterruptedException, AWTException 
	{	
		element_ToBe_Clickable(DealerDeshbord);                   
		
		 element_ToBe_Clickable(Edit_Button);                    		                 
		
		element_ToBe_Clickable(Condition);                        
		element_ToBe_Clickable(Condition_Used);		
		
		Thread.sleep(2000);
		Year.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Year, "2022"); 
		
		      
		Thread.sleep(2000);
		Mileage.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Mileage, "321");  
		
		element_ToBe_Clickable(Engine_Type);
		
		element_ToBe_Clickable(No_OFCylinder);

		element_ToBe_Clickable(Select_Cylinder);
		
		Thread.sleep(2000);
		VolumeL.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(VolumeL, "3");
		
		
		Thread.sleep(2000);
		PowerRTM.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(PowerRTM, "3");
		
		element_ToBe_Clickable(Transmission);
		
		element_ToBe_Clickable(Drive_Train);
		
		element_ToBe_Clickable(Body_Style);
		
		
		Thread.sleep(2000);
		Transmission_speed.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Transmission_speed, "300");
		
		
		Thread.sleep(2000);
		Passanger_capacity.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Passanger_capacity, "7");
		
		
		Thread.sleep(2000);
		Engine_block_Type.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		Thread.sleep(2000);
		visibility_Of_Element(Engine_block_Type, "3");
		                            
		
		element_ToBe_Clickable(Exteriar_Color);                   
		
		element_ToBe_Clickable(Interiar_Color);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Chose_photo);
		
        Thread.sleep(2000);
		
		choose_file("C:\\Users\\MohammedFaisal\\OneDrive - Paktolus Solutions - HigherL LLC\\Desktop\\DPRTest\\Test_Data\\imag1.jpg");
		
		//element_ToBe_Clickable(CallForPrice);
		
		//element_ToBe_Clickable(Vehicle_Feauture1);
		
		//element_ToBe_Clickable(Vehicle_Feauture2);
		
		//element_ToBe_Clickable(Save_Button);                      	
	}
	
	public void Dealer_Deshbord_Remove_Car() throws InterruptedException
	{
		Thread.sleep(10000);
		element_ToBe_Clickable(Remove_Button);                     
	}

	public void Dealer_Deshbord_Re_List_Car() throws InterruptedException
	{
		Thread.sleep(10000);
		element_ToBe_Clickable(ReList);                            
	}
	
	
}
