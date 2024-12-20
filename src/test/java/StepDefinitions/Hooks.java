package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

    // Cucumbera ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after(Scenario scenario){

//        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/CucumberTestReport.xlsx",
//                scenario.getName(),
//                scenario.isFailed() ? "Fail": "Passed"
//        );

      //   aşağıdaki bölüm sadece extend report plugini devrede ise açılır
        if (scenario.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
            byte[] pictureInTheMemory=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(pictureInTheMemory, "image/png", "screenshot name");
        }


    // Quit the driver after all tests
        GWD.quitDriver();
    }
}
