package browser_command;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Command {

	public static void main(String[] args) {
		// Setting System properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		// Initiating Chrome Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		// Starting the program
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// Using "Get command" to start a new tab
		
		driver.get("https://www.youtube.com/?gl=IN");
		
		
	}

}
