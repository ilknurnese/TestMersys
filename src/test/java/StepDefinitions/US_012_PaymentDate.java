package StepDefinitions;


import Pages.MainMenuPage;
import io.cucumber.java.en.When;

public class US_012_PaymentDate {
    MainMenuPage MMP = new MainMenuPage();
    @When("I can download my total debt as pdf or exxel. I can follow the payment schedule more easily.")
    public void iCanDownloadMyTotalDebtAsPdfOrExxelICanFollowThePaymentScheduleMoreEasily() {
        MMP.myClick(MMP.HamburgerMenu);
        MMP.myClick(MMP.Finance);
        MMP.myClick(MMP.Myfinance);
        MMP.myClick(MMP.Ellipsis);
        MMP.myClick(MMP.Exxel);

    }
}
