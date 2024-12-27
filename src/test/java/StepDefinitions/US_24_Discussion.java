package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_24_Discussion {
    MainMenuPage mmp=new MainMenuPage();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
    @Then("Click on Discussion")
    public void clickOnDiscussion() {
//        Actions aksiyonlar=new Actions(GWD.getDriver());
//       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='mat-focus-indicator'])[25]")));
//        Action aksiyon=aksiyonlar.moveToElement(mmp.Discussion).build();
//        aksiyon.perform();
        mmp.myClick(mmp.Discussion);
        mmp.myClick(mmp.students);
        MyFunc.Bekle(10);
        mmp.myClick(mmp.students);
        MyFunc.Bekle(10);
        new Actions(GWD.getDriver())
                .keyDown(Keys.ESCAPE)
                .build()
                .perform();
        mmp.myClick(mmp.Submit);
        MyFunc.Bekle(10);
        new Actions(GWD.getDriver())
                .keyDown(Keys.ESCAPE)
                .build()
                .perform();
        mmp.myClick(mmp.markIt);
        MyFunc.Bekle(10);
        mmp.myClick(mmp.Assignment);
        MyFunc.Bekle(10);
        mmp.myClick(mmp.backfromAssignment);
        MyFunc.Bekle(5);
        mmp.myClick(mmp.bosluk);
        MyFunc.Bekle(10);
        mmp.myClick(mmp.backfromAssignment);
        MyFunc.Bekle(10);

    }

}
