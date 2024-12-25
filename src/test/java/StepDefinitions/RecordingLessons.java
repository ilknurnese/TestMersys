package StepDefinitions;

import Pages.MainMenuPage;
import io.cucumber.java.en.Then;

public class RecordingLessons {
    @Then("Click on endLessons")
    public void clickOnEndLessons() {

        MainMenuPage MMP=new MainMenuPage();
        MMP.myClick(MMP.EndLessons);
        MMP.myClick(MMP.RecordinBtn);
        MMP.myClick(MMP.PlayBtn);



    }
}
