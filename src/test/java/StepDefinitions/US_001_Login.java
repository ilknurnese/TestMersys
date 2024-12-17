package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_001_Login {

    MainMenuPage mmp=new MainMenuPage();

    @Given("Navigate to TestMersys")
    public void navigateToTestMersys() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and Password as username {string} as password {string}")
    public void enterUsernameAndPasswordAsUsernameAsPassword(String username, String password) {

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
        mmp.mySendKeys(mmp.userName,username);
        mmp.mySendKeys(mmp.passWord,password);
        mmp.myClick(mmp.loginTo);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        MyFunc.Bekle(5);
        mmp.LoginContainsText(mmp.headText,"Welcome, Student_7 11A !");
 }
}

