package StepDefinitions;


import Pages.MainMenuPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_007_deleteOutMessagingSteps {
    MainMenuPage MMP = new MainMenuPage();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));



    @When("Delete outbox message")
    public void deleteOutboxMessage() {
    MMP.myClick(MMP.hamburgerMenuButton);
    MMP.myClick(MMP.messagingButton);
    MMP.myClick(MMP.outBoxButton);
    MMP.myClick(MMP.message);
    MMP.myClick(MMP.confirmDeleteYes);
    }
    @Then("The deletion process should be successfuly")
    public void theDeletionProcessShouldBeSuccessfuly() {
        MMP.verifyMessageContainsText("successfully");


    }


}
