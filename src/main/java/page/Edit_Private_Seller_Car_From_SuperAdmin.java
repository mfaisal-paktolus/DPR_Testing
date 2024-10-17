package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;


public class Edit_Private_Seller_Car_From_SuperAdmin extends BaseLibrary
{
	public Edit_Private_Seller_Car_From_SuperAdmin()
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
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement Search_Car;
	
	
	
	
	
	@FindBy(xpath="//div[@class='dropdown dropdown-actions']")
	private WebElement Three_dots;
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement edit_car;
	
	
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
	
	@FindBy(xpath="//div[text()='new']")
	private WebElement select_car_condition;
	
	@FindBy(xpath="//div[@id='Car_exteriorColor-ts-control']")
	private WebElement exterior_color;
	
	@FindBy(xpath="//div[@id='Car_exteriorColor-opt-1']")
	private WebElement select_exterior_color;
	
	@FindBy(xpath="//div[@id='Car_interiorColor-ts-control']")
	private WebElement intiriar_color;
	
	@FindBy(xpath="//div[@id='Car_interiorColor-opt-4']")
	private WebElement select_intiriar_color;
	
	@FindBy(xpath="//div[@id='Car_status-ts-control']")
	private WebElement Status;
	
	@FindBy(xpath="//div[@id='Car_carPriceStatus-ts-control']")
	private WebElement carPrice_status;
	
	@FindBy(xpath="//div[@id='Car_carPriceStatus-opt-3']")
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
	
	@FindBy(xpath="//div[@id='Car_carModel-opt-3159']")
	private WebElement select_car_model;
	
	@FindBy(xpath="//div[@id='Car_carModificationFuelType-ts-control']")
	private WebElement Fuel_Type;
	
	@FindBy(xpath="//div[text()='diesel']")
	private WebElement select_Fuel_type;
	
	@FindBy(xpath="//div[@id='Car_carModificationTransmission-ts-control']")
	private WebElement Transmission;
	
	@FindBy(xpath="//div[text()='automatic']")
	private WebElement select_transmission;
	
	@FindBy(xpath="//div[@id='Car_carModificationDriveTrain-ts-control']")
	private WebElement Drive_Train;
	
	@FindBy(xpath="//div[text()='rwd']")
	private WebElement select_drive_train;
	
	@FindBy(xpath="//div[@id='Car_carModificationBodyStyle-ts-control']")
	private WebElement Body_style;
	
	@FindBy(xpath="//div[text()='sedan-long']")
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
	
	
	
	
	
	@FindBy(xpath="//span[text()='Save changes']")
	private WebElement Save_Changes;
	
	
	public void Login_Super_Admin() throws InterruptedException
	{
		Thread.sleep(1000);
		visibility_Of_Element(username, "superadmin@motorsport.com");
		
		Thread.sleep(1000);
		visibility_Of_Element(password, "sS9&B!d0eVb@");
		
		Thread.sleep(1000);
		element_ToBe_Clickable(SignIn);
	}
	
	public void SearchCar() throws InterruptedException, AWTException 
	{
		Thread.sleep(5000);
		element_ToBe_Clickable(PrivateSeller_Car_Button);
		
		Thread.sleep(1000);
		visibility_Of_Element(Search_Car, "224237");
		
		Thread.sleep(1000);
		
	    Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
        Thread.sleep(10000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(1000,0)");
        
        Thread.sleep(10000);
        element_ToBe_Clickable(Three_dots);
        
        
        Thread.sleep(1000);
        element_ToBe_Clickable(edit_car);
	}
	
	public void Edit_Car_Deatils() throws InterruptedException, AWTException
	{
		
		Thread.sleep(2000);
		element_ToBe_Clickable(Owner);
		
		Thread.sleep(5000);
		visibility_Of_Element(Search_Owner, "mfaisal6720@gmail.com");
		
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		Enter_Vin.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Enter_Vin, "12345asdfg");
		
		
		Thread.sleep(1000);
		Enter_Stock.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Enter_Stock, "321");
		
		
		Thread.sleep(1000);
		Enter_Price.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Enter_Price, "321");
		
		
		Thread.sleep(1000);
		Enter_Mileage.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Enter_Mileage, "321");
		
		
		Thread.sleep(1000);
		Enter_year.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Enter_year, "2000");
		
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Video);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(car_condition);
		
		element_ToBe_Clickable(select_car_condition);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(exterior_color);
		
		element_ToBe_Clickable(select_exterior_color);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(intiriar_color);
		
		element_ToBe_Clickable(select_intiriar_color);
		
		js.executeScript("arguments[0].scrollIntoView(true);", Status);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(carPrice_status);
		
		element_ToBe_Clickable(select_carPrice_status);
	}
	
	public void Edit_Contact_Info() throws InterruptedException
	{		
		Thread.sleep(1000);
		First_name.clear();
		Thread.sleep(1000);
        visibility_Of_Element(First_name, "Faizu");
		
        Thread.sleep(1000);
		Last_name.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Last_name, "Khan");
		
		Thread.sleep(1000);
		Email.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Email, "mfaisal6720@gmail.com");
		
		Thread.sleep(1000);
		phone_number.clear();
		Thread.sleep(1000);
		visibility_Of_Element(phone_number, "0987654321");
		
		Thread.sleep(1000);
		Zip_code.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Zip_code, "01344");
	}
	
	public void Edit_Modification_details() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", address);
		
		Thread.sleep(5000);
		//element_ToBe_Clickable(car_model);
		
		//element_ToBe_Clickable(select_car_model);
		
		//Thread.sleep(1000);
		element_ToBe_Clickable(Fuel_Type);
		
		element_ToBe_Clickable(select_Fuel_type);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(Transmission);
		
		element_ToBe_Clickable(select_transmission);
		
		Thread.sleep(1000);
		element_ToBe_Clickable(Drive_Train);
		
		element_ToBe_Clickable(select_drive_train);
		
		js.executeScript("arguments[0].scrollIntoView(true);", Drive_Train);
		
		Thread.sleep(5000);
		element_ToBe_Clickable(Body_style);
		
		element_ToBe_Clickable(select_Body_Style);
		
		Thread.sleep(1000);
		engine_displacemenet.clear();
		Thread.sleep(1000);
		visibility_Of_Element(engine_displacemenet, "2");
		
		Thread.sleep(1000);
		transmission_speed.clear();
		Thread.sleep(1000);
		visibility_Of_Element(transmission_speed, "2");
		
		Thread.sleep(1000);
		Engine_BlockType.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Engine_BlockType, "2");
		
		Thread.sleep(1000);
		Passanger_Capacity.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Passanger_Capacity, "2");
		
		Thread.sleep(1000);
		engine_cylinder.clear();
		Thread.sleep(1000);
		visibility_Of_Element(engine_cylinder, "2");
		
		Thread.sleep(1000);
		Power.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Power, "2");
		
		Thread.sleep(1000);
		electric_Capacity.clear();
		Thread.sleep(1000);
		visibility_Of_Element(electric_Capacity, "1");
		
		Thread.sleep(1000);
		Electric_powerReserve.clear();
		Thread.sleep(1000);
		visibility_Of_Element(Electric_powerReserve, "1");
		
//		Thread.sleep(1000);
//		element_ToBe_Clickable(Save_Changes);
	}
}
