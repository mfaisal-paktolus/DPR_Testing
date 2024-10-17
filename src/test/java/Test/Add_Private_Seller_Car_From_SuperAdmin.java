package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Add_Private_Seller_Car_From_SuperAdmin extends BaseLibrary
{
    public Add_Private_Seller_Car_From_SuperAdmin()
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement SignIn;
	
	
	
	@FindBy(xpath="(//a[@class='menu-item-contents  '])[2]")
	private WebElement PrivateSeller_Car_Button;
	
	
	@FindBy(xpath="//a[text()='Add Car']")
	private WebElement Add_Car;
	
	@FindBy(xpath="//div[@id='Car_owner_autocomplete-ts-control']")
	private WebElement Owner;
	
	@FindBy(xpath="(//input[@type='select-one'])[1]")
	private WebElement Search_Owner;
	
	
	@FindBy(xpath="//input[@id='Car_vin']")
	private WebElement Enter_Vin;
	
	@FindBy(xpath="//input[@id='Car_stock']")
	private WebElement Enter_Stock;
	
	@FindBy(xpath="//input[@id='Car_price']")
	private WebElement Enter_Price;
	
	@FindBy(xpath="//input[@id='Car_mileage']")
	private WebElement Enter_Mileage;
	
	@FindBy(xpath="//input[@id='Car_year']")
	private WebElement Enter_year;
	
	@FindBy(xpath="//input[@id='Car_video']")
	private WebElement Video;
	
	
	
	@FindBy(xpath="//div[@id='Car_carCondition-ts-control']")
	private WebElement car_condition;
	
	@FindBy(xpath="//div[text()='used']")
	private WebElement select_car_condition;
	
	@FindBy(xpath="//div[@id='Car_exteriorColor-ts-control']")
	private WebElement exterior_color;
	
	@FindBy(xpath="//div[@id='Car_exteriorColor-opt-2']")
	private WebElement select_exterior_color;
	
	@FindBy(xpath="//div[@id='Car_interiorColor-ts-control']")
	private WebElement intiriar_color;
	
	@FindBy(xpath="//div[@id='Car_interiorColor-opt-3']")
	private WebElement select_intiriar_color;
	
	@FindBy(xpath="//div[@id='Car_status-ts-control']")
	private WebElement Status;
	
	@FindBy(xpath="//div[text()='published']")
	private WebElement select_Status;
	
	@FindBy(xpath="//div[@id='Car_carPriceStatus-ts-control']")
	private WebElement carPrice_status;
	
	@FindBy(xpath="//div[@id='Car_carPriceStatus-opt-1']")
	private WebElement select_carPrice_status;
	
	
	@FindBy(xpath="//input[@id='Car_contactInfo_firstName']")
	private WebElement First_name;
	
	@FindBy(xpath="//input[@id='Car_contactInfo_lastName']")
	private WebElement Last_name;
	
	@FindBy(xpath="//input[@id='Car_contactInfo_email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='Car_contactInfo_phone']")
	private WebElement phone_number;
	
	@FindBy(xpath="//input[@id='Car_contactInfo_zipcode']")
	private WebElement Zip_code;
	
	@FindBy(xpath="//input[@id='Car_contactInfo_address']")
	private WebElement address;
	
	
	
	@FindBy(xpath="//div[@id='Car_carModel-ts-control']")
	private WebElement car_model;
	
	@FindBy(xpath="//div[@id='Car_carModel-opt-2']")
	private WebElement select_car_model;
	
	@FindBy(xpath="//div[@id='Car_carModificationFuelType-ts-control']")
	private WebElement Fuel_Type;
	
	@FindBy(xpath="//div[text()='petrol']")
	private WebElement select_Fuel_type;
	
	@FindBy(xpath="//div[@id='Car_carModificationTransmission-ts-control']")
	private WebElement Transmission;
	
	@FindBy(xpath="//div[text()='manual']")
	private WebElement select_transmission;
	
	@FindBy(xpath="//div[@id='Car_carModificationDriveTrain-ts-control']")
	private WebElement Drive_Train;
	
	@FindBy(xpath="//div[text()='fwd']")
	private WebElement select_drive_train;
	
	@FindBy(xpath="//div[@id='Car_carModificationBodyStyle-ts-control']")
	private WebElement Body_style;
	
	@FindBy(xpath="//div[text()='sedan']")
	private WebElement select_Body_Style;
	
	@FindBy(xpath="//input[@id='Car_carModification_engineDisplacement']")
	private WebElement engine_displacemenet;
	
	@FindBy(xpath="//input[@id='Car_carModification_transmissionSpeed']")
	private WebElement transmission_speed;
	
	@FindBy(xpath="//input[@id='Car_carModification_engineBlockType']")
	private WebElement Engine_BlockType;
	
	@FindBy(xpath="//input[@id='Car_carModification_passengerCapacity']")
	private WebElement Passanger_Capacity;
	
	@FindBy(xpath="//input[@id='Car_carModification_engineCylinder']")
	private WebElement engine_cylinder;
	
	@FindBy(xpath="//input[@id='Car_carModification_power']")
	private WebElement Power;
	
	@FindBy(xpath="//input[@id='Car_carModification_electricCapacity']")
	private WebElement electric_Capacity;
	
	@FindBy(xpath="//input[@id='Car_carModification_electricPowerReserve']")
	private WebElement Electric_powerReserve;
	
	@FindBy(xpath="//span[text()='Create']")
	private WebElement create_button;
	
	public void Login_Super_Admin() throws InterruptedException
	{
		Thread.sleep(1000);
		visibility_Of_Element(username, "superadmin@motorsport.com");
		
		Thread.sleep(1000);
		visibility_Of_Element(password, "sS9&B!d0eVb@");
		
		Thread.sleep(1000);
		element_ToBe_Clickable(SignIn);
	}
	
	public void ADD_Private_seller_Car() throws InterruptedException
	{
		Thread.sleep(5000);
		element_ToBe_Clickable(PrivateSeller_Car_Button);
		
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2000,0)");
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Add_Car);
	}
	
	public void Add_Car_details() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		element_ToBe_Clickable(Owner);
		
		Thread.sleep(5000);
		visibility_Of_Element(Search_Owner, "mohdfaizu672@gmail.com");
		
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		visibility_Of_Element(Enter_Vin, "asdfg12345");
		
		Thread.sleep(1000);
		visibility_Of_Element(Enter_Stock, "123");
		
		Thread.sleep(1000);
		visibility_Of_Element(Enter_Price, "123");
		
		Thread.sleep(1000);
		visibility_Of_Element(Enter_Mileage, "123");
		
		Thread.sleep(1000);
		visibility_Of_Element(Enter_year, "2022");
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Video);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(car_condition);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_car_condition);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(exterior_color);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_exterior_color);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(intiriar_color);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_intiriar_color);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Status);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_Status);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(carPrice_status);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_carPrice_status);
	}
	
	
	public void Contact_Info()
	{
		visibility_Of_Element(First_name, "Faisal");
		
		visibility_Of_Element(Last_name, "Ahmad");
		
		visibility_Of_Element(Email, "mohdfaizu672@gmail.com");
		
		visibility_Of_Element(phone_number, "1234567890");
		
		visibility_Of_Element(Zip_code, "01342");
	}
	
	public void car_modifiaction_details() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", address);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(car_model);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_car_model);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(Fuel_Type);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_Fuel_type);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(Transmission);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_transmission);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(Drive_Train);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_drive_train);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Body_style);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(select_Body_Style);
		
		Thread.sleep(1000);
		visibility_Of_Element(engine_displacemenet, "1");
		
		Thread.sleep(1000);
		visibility_Of_Element(transmission_speed, "1");
		
		Thread.sleep(1000);
		visibility_Of_Element(Engine_BlockType, "1");
		
		Thread.sleep(1000);
		visibility_Of_Element(Passanger_Capacity, "1");
		
		Thread.sleep(1000);
		visibility_Of_Element(engine_cylinder, "1");
		
		Thread.sleep(1000);
		visibility_Of_Element(Power, "1");
		
		Thread.sleep(1000);
		visibility_Of_Element(electric_Capacity, "0");
		
		Thread.sleep(1000);
		visibility_Of_Element(Electric_powerReserve, "0");
		
//		Thread.sleep(1000);
//		element_ToBe_Clickable(create_button);
	}
}
