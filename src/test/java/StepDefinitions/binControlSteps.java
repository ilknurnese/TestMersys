package StepDefinitions;

import Pages.MainMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class binControlSteps {
    MainMenuPage MMP = new MainMenuPage();


    @When("Navigate to trash box")
    public void navigateToTrashBox() {
        MMP.myClick(MMP.hamburgerMenuButton);
        MMP.myClick(MMP.messagingButton);
        MMP.myClick(MMP.trashButton);


    }

    @And("Restore message on the trash box")
    public void restoreMessageOnTheTrashBox() {
        MMP.myClick(MMP.restoreIcon);

    }

    @And("successfully message should be displayed")
    public void successfullyMessageShouldBeDisplayed() {
        MMP.verifyMessageContainsText("successfully");
    }

    @And("delete message on the trash box")
    public void deleteMessageOnTheTrashBox() {
        MMP.myClick(MMP.deleteIcon);
        MMP.myClick(MMP.deleteToTrashBox);
    }
}
