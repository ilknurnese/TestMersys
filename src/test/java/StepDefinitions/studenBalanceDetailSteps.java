package StepDefinitions;


import Pages.MainMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class studenBalanceDetailSteps {
MainMenuPage MMP=new MainMenuPage();
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
