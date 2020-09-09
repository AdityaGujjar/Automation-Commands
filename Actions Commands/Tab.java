package mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_click_action {

	public static void main(String[] args) {
		// Setting up the System Settings
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating Chrome Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting actual code
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Aditya");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("Gujjar").perform();
		
		

	}

}
