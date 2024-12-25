package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.zh_cn.那么;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Lessons {
    @Then("Click on Lessons")
    public void clickOnLessons() {

        MainMenuPage MMP=new MainMenuPage();
        MMP.myClick(MMP.EndLessons);
        MMP.myClick(MMP.LessonsP);

        new Actions(GWD.getDriver())

                .keyDown(Keys.ESCAPE)
                .build()
                .perform();


        MMP.myClick(MMP.LessonsS);
        new Actions(GWD.getDriver())

                .keyDown(Keys.ESCAPE)
                .build()
                .perform();



    }
}
