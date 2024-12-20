package StepDefinitions;

import Utilities.GWD;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks {

//    @BeforeClass
//    public void before() {
//        // Open the browser and navigate to the website
//        GWD.getDriver().get("https://testmersys.com");
//
//        // Perform login
//        GWD.getDriver().findElement(By.id("username")).sendKeys("Student_7");
//        GWD.getDriver().findElement(By.id("password")).sendKeys("S12345");
//        GWD.getDriver().findElement(By.id("loginButton")).click();
//    }

    @AfterClass
    public void after(){
    // Quit the driver after all tests
        GWD.quitDriver();
    }
}
