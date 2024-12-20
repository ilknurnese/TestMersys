package StepDefinitions;


import Pages.MainMenuPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_011_Finance {
    MainMenuPage MMP = new MainMenuPage();
    @When("I should be able to get to the payment page")
    public void iShouldBeAbleToGetToThePaymentPage() {
        MMP.myClick(MMP.HamburgerMenu);
        MMP.myClick(MMP.Finance);
        MMP.myClick(MMP.Myfinance);
        MMP.myClick(MMP.Studentname);
    }

    @Then("I pay my installment and my debt should decrease")
    public void iPayMyInstallmentAndMyDebtShouldDecrease() {
    }
}
