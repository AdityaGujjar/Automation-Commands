package mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_action {

	public static void main(String[] args) throws InterruptedException {
		// Setting System properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the code
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.contextClick(driver.findElement(By.linkText("Forgotten account?"))).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
