package mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_hold_action {

	public static void main(String[] args) {
		// Setting up system properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_2")).click();
		
		driver.findElement(By.name("firstname")).click();

		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.SHIFT).perform();
		
		act.sendKeys("Aditya");
		
		
		
		
	}

}
