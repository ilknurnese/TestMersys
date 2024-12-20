package StepDefinitions;


import Pages.MainMenuPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_010_HamburgerStep {
    MainMenuPage MMP = new MainMenuPage();
    @When("Hamburger menu finance click")
    public void hamburgerMenuFinanceClick() {
        MMP.myClick(MMP.HamburgerMenu);
        MMP.myClick(MMP.Finance);
        MMP.myClick(MMP.Myfinance);
        MMP.myClick(MMP.Studentname);
        //Assert.assertTrue(elements.OnlinePayment.isDisplayed());
        //Assert.assertTrue(elements.FeeBalanceDetail.isDisplayed());



    }

    @Then("Your payment will be deducted from the remaining amount")
    public void yourPaymentWillBeDeductedFromTheRemainingAmount() {
        MMP.myClick(MMP.Stripe);
        MMP.myClick(MMP.PayInFull);
        MMP.myClick(MMP.Pay);
        MMP.mySendKeys(MMP.Amount, "100");
        MMP.myClick(MMP.Pay);
        MMP.myClick(MMP.PayClick);
        MyFunc.Bekle(10);
        WebElement iframe = GWD.getDriver().findElement(By.name("__privateStripeFrame3949"));
        GWD.getDriver().switchTo().frame(iframe);

        MMP.mySendKeys(MMP.CardNumber,"4242 4242 4242 4242");
        MMP.mySendKeys(MMP.ExpirationDate,"12 26");
        MMP.mySendKeys(MMP.SecurityCode,"340");
    }
}
