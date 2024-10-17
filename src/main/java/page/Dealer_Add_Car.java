package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Dealer_Add_Car extends BaseLibrary
{
	public Dealer_Add_Car()
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
	
	@FindBy(xpath="//button[@style='height: 44px;']")
	private WebElement AddCarButton;
	
	@FindBy(xpath="//input[@id='vin']")
	private WebElement VinText;
	
	@FindBy(xpath="//input[@id='stock']")
	private WebElement Stock;
	
	@FindBy(xpath="//div[@data-test='Make']")
	private WebElement Make;
	
	@FindBy(xpath="//div[@id='react-select-2-option-2']")
	private WebElement AC_Make;
	
	@FindBy(xpath="//div[@data-test='Model']")
	private WebElement Model;
	
	@FindBy(xpath="//div[@id='react-select-3-option-1']")
	private WebElement Cobra_Model;
	
	@FindBy(xpath="//div[@data-test='Condition']")
	private WebElement Condition;
	
	@FindBy(xpath="//span[text()='New']")
	private WebElement Select_condition;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement Year;
	
	@FindBy(xpath="//input[@id=\'mileage\']")
	private WebElement Mileage;
	
	@FindBy(xpath="//span[text()='Gasoline']")
	private WebElement Engine_Type;
	
	@FindBy(xpath="(//div[@id='test'])[4]")
	private WebElement No_OFCylinder;
	
	@FindBy(xpath="//span[text()='2']")
	private WebElement Select_Cylinder;
	
	@FindBy(xpath="//input[@id='workingVolume']")
	private WebElement VolumeL;
	
	@FindBy(xpath="//input[@id='powerAtRPM']")
	private WebElement PowerRTM;
	
	@FindBy(xpath="//span[text()='Manual']")
	private WebElement Transmission;
	
	@FindBy(xpath="//span[text()='Fwd (front-wheel drive)']")
	private WebElement Drive_Train;
	
	@FindBy(xpath="//span[text()='Sedan']")
	private WebElement Body_Style;
	
	@FindBy(xpath="//input[@id='transmissionSpeed']")
	private WebElement Transmission_speed;
	
	@FindBy(xpath="//input[@id='passengerCapacity']")
	private WebElement Passanger_capacity;
	
	@FindBy(xpath="//input[@id='engineBlockType']")
	private WebElement Engine_block_Type;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement Description;
	
	@FindBy(xpath="(//li[@title='Black'])[1]")
	private WebElement Exteriar_Color;
	
	@FindBy(xpath="(//li[@title='Black'])[2]")
	private WebElement Interiar_Color;
	
//	@FindBy(xpath="//input[@id='34']")
//	private WebElement Vehicle_Feauture1;
//	
//	@FindBy(xpath="//input[@id='35']")
//	private WebElement Vehicle_Feauture2;
	
	@FindBy(xpath="//div[@data-test='uploader-container']")
	private WebElement Chose_photo;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement Save_Button;
	
	
	
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
	
	public void Dealer_Deshbord_Add_Car() throws InterruptedException 
	{	
		element_ToBe_Clickable(DealerDeshbord);                   
		
		element_ToBe_Clickable(AddCarButton);                    
		                         
		visibility_Of_Element(VinText, "123abc");                  
		                            
		visibility_Of_Element(Stock, "123");                        
		
		element_ToBe_Clickable(Make);                             
		element_ToBe_Clickable(AC_Make);                          
		
		element_ToBe_Clickable(Model);                            
		element_ToBe_Clickable(Cobra_Model);                      		                 
		
		element_ToBe_Clickable(Condition);                        
		element_ToBe_Clickable(Select_condition); 
		
		element_ToBe_Clickable(Year);                             
		visibility_Of_Element(Year, "2020");                     
		
		element_ToBe_Clickable(Mileage);                          
		visibility_Of_Element(Mileage, "123");  
		
		element_ToBe_Clickable(Engine_Type);
		
		element_ToBe_Clickable(No_OFCylinder);

		element_ToBe_Clickable(Select_Cylinder);
		
		visibility_Of_Element(VolumeL, "2");
		
		visibility_Of_Element(PowerRTM, "2");
		
		element_ToBe_Clickable(Transmission);
		
		element_ToBe_Clickable(Drive_Train);
		
		element_ToBe_Clickable(Body_Style);
		
		visibility_Of_Element(Transmission_speed, "200");
		
		visibility_Of_Element(Passanger_capacity, "5");
		
		visibility_Of_Element(Engine_block_Type, "2");
		                                      
		visibility_Of_Element(Description, "For testing pUrpose");
		
		element_ToBe_Clickable(Exteriar_Color);                   
		
		element_ToBe_Clickable(Interiar_Color); 
		
		//element_ToBe_Clickable(Vehicle_Feauture1);
		
		//element_ToBe_Clickable(Vehicle_Feauture2);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Chose_photo);
		
        Thread.sleep(2000);
		
		choose_file("C:\\Users\\MohammedFaisal\\OneDrive - Paktolus Solutions - HigherL LLC\\Desktop\\DPRTest\\Test_Data\\imag1.jpg");
		
		element_ToBe_Clickable(Save_Button);                      	
	}
	


}
