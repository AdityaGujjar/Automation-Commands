package facebook_web;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sign_in {

	public static void main(String[] args) {
		// Setting up system properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//calling the chrome driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the code
		driver.navigate().to("https://www.facebook.com/");
		
	    driver.findElement(By.name("firstname")).sendKeys("Aditya");
	    
	    driver.findElement(By.name("lastname")).sendKeys("Gujjar");
	    
	    driver.findElement(By.name("reg_email__")).sendKeys("adityagujjar820@gmail.com");
	    
	    driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
	    
	    Select selectByValue=new Select(driver.findElement(By.id("day")));
	    selectByValue.selectByValue("28");
	    
	    Select selectByValue1=new Select(driver.findElement(By.id("month")));
	    selectByValue1.selectByValue("8");
	    
	    Select selectByValue2=new Select(driver.findElement(By.id("year")));
	    selectByValue2.selectByValue("1994");
	    
	    driver.findElement(By.xpath("//label[@for='u_0_7']")).click();
	    
	   
	}

}
