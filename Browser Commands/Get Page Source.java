package browser_command;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_Source {

	public static void main(String[] args) {
		//Setting up System properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the code
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Using Get page source command
		
		String PageSource= driver.getPageSource();
		
		System.out.println(PageSource);
		

	}

}
