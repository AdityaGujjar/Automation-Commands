package real_automation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_10_users {
	
	@Test

	public void Screenshot_copy() throws Exception{
		// Setting up the System properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the actual code
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Username1");
		
		driver.findElement(By.id("pass")).sendKeys("password1");
		
		driver.findElement(By.id("u_0_b")).click();
		
		Thread.sleep(5000);
		
		this.takeSnapShot(driver, "D:\\username1.png");
		

	}
	
	
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
                
         
                

    }

}
