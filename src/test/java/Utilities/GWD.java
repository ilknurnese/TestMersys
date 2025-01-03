package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//General Web Driver
public class GWD {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null)
            driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        return driver;
    }
    public static void quitDriver(){

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
