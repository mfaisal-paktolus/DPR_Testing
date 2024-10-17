package baselibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Common_Utility.Common_Utility;
import WaitUtility.Wait_Utility;


public class BaseLibrary implements Wait_Utility,Common_Utility
{
	 public static WebDriver driver=null;
	
	
	public void launchUrl(String url, String browser)
	{	
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("WebDriver.chrome.driver","C:\\\\Users\\\\MohammedFaisal\\\\OneDrive - Paktolus Solutions - HigherL LLC\\\\Desktop\\\\DPRTest\\\\Driver\\\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get(url);
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			//System.setProperty("WebDriver.edge.driver","C:\\Users\\MohammedFaisal\\OneDrive - Paktolus Solutions - HigherL LLC\\Desktop\\DPRTest\\Driver\\msedgedriver.exe");
	        driver=new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get(url);
		}
		else
		{
			System.out.println("Wrong browser");
		}	
		

	}

	public void element_ToBe_Clickable(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		ele.click();
	}
	
	public void visibility_Of_Element(WebElement ele, String input)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		ele.sendKeys(input);
	
	}

	
	
	@Override
	public void mouse_over_Click(WebElement ele, String value) 
	{
		
		try 
		{
			
	     Actions act=new Actions(driver);
	     act.moveToElement(ele).build().perform();	
	     driver.findElement(By.linkText(value)).click();
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Issue in mouse over");
		}
		
		
	}

	@Override
	public void changeWindow(int tabno) 
	{
		Set<String> handles=driver.getWindowHandles();
		ArrayList<String> listofHandles = new ArrayList<String>(handles);
			driver.switchTo().window(listofHandles.get(tabno));	
	}

	@Override
	public void choose_file(String Path) 
	{
		try 
		{
			StringSelection slc= new StringSelection(Path);
			
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			
			clipboard.setContents(slc,null);
			
			Robot robot=new Robot();
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);	
			
		}
		
		catch(Exception e)
		{
			System.out.println("Issue in upload file" + e);
		}
	}

	
}
