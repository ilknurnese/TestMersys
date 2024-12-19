package StepDefinitions;


import Pages.MainMenuPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class US_009_studentBalanceDetailSteps {
MainMenuPage MMP=new MainMenuPage();
    Actions actions=new Actions(GWD.getDriver());


    @And("fistly click on the student name and click on the balance details")
    public void fistlyClickOnTheStudentNameAndClickOnTheBalanceDetails() {
      MMP.myClick(MMP.studentName);
      MMP.myClick(MMP.balanceDetailsButton);

    }

    @Then("balance details should be displayed")
    public void balanceDetailsShouldBeDisplayed() {
        MMP.verifyContainText(MMP.detailPage,"Installment");
    }



}
