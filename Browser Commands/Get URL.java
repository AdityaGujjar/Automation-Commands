package browser_command;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_URL {

	public static void main(String[] args) {
		// Setting up system properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the code
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Using the Get URL command
		
		String URL=driver.getCurrentUrl();
		
		System.out.println(URL);
		
	}

}
