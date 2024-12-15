package StepDefinitions;


import Pages.MainMenuPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class financeSteps {
    MainMenuPage MMP=new MainMenuPage();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    @When("navigate to Finance page")
    public void navigateToFinancePage() {
        MMP.myClick(MMP.hamburgerMenuButton);
        MMP.myClick(MMP.finance);
        MMP.myClick(MMP.myFinance);
        
    }
    @Then("Finance page should be displayed")
    public void financePageShouldBeDisplayed() {
    MMP.verifyContainText(MMP.financePageIsDisplayed,"Student");


}}
