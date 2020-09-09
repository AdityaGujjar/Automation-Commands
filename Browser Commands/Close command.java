package browser_command;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Command {

	public static void main(String[] args) {
		// Setting up system properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating the driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the code
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Using the close command
		
		driver.close();
		
		

	}

}
