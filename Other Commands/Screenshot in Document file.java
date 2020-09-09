package special_commands;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Facebook_screenshot {

    @Test

    public void Screenshot_copy() throws Exception{

		
    	System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\latest\\chromedriver_win32\\chromedriver.exe");
    	ChromeDriver driver=new ChromeDriver();

        //goto url

        driver.get("https://www.facebook.com/");

        //Call take screenshot function

        this.takeSnapShot(driver, "D:\\screenshot.docx") ;  
        
        driver.findElement(By.id("u_0_2")).click();
        
        Thread.sleep(1000);
        
        this.takeSnapShot(driver, "D:\\screenshot.docx") ;  
        
        driver.quit();
        
     
    }

    /**

     * This function will take screenshot

     * @param webdriver

     * @param fileWithPath

     * @throws Exception

     */

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
