package StepDefinitions;

import Pages.MainMenuPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssigmentS {
    @Then("Click on AssignmentSearch")
    public void clickOnAssignmentSearch() {

        MainMenuPage MMP=new MainMenuPage();
        MMP.myClick(MMP.Assignments);

    }
}
