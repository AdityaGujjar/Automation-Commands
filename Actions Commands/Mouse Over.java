package mouse_keyboard_actions;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class Mouse_over_action {
	
	@Test

	public static void main(String[] args) {
		// Setting up system properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the actual code
		
		driver.get("https://www.facebook.com/");
		
		Actions act =new Actions(driver);
		
		act.moveToElement(driver.findElement(By.name("birthday_day"))).perform();
		
	}

}
