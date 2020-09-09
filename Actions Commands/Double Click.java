package mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_action {

	public static void main(String[] args) {
		//Setting system properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the code
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//img[@src='imgs/galaxy_s6.jpg']"))).perform();

	}

}
