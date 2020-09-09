package special_commands;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_action {

	public static void main(String[] args) throws InterruptedException {
		// Setting up System properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting actual code
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
