package WaitUtility;

import org.openqa.selenium.WebElement;

public interface Wait_Utility 
{

    public void element_ToBe_Clickable(WebElement ele);
	
	public void visibility_Of_Element(WebElement ele, String input);
}
