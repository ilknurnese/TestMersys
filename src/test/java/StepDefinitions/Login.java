package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
//BN:Betül Notlar
public class Login {
    MainMenuPage mmp=new MainMenuPage();
    @Given("Navigate to TestMersys")
    public void navigateToTestMersys() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and Password as username {string} as password {string}")
    public void enterUsernameAndPasswordAsUsernameAsPassword(String username, String password) {

        //Öğrenci username ve password ü ile login olunuyor

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
        mmp.mySendKeys(mmp.userName,username);
        mmp.mySendKeys(mmp.passWord,password);
        mmp.myClick(mmp.loginTo);

        MyFunc.Bekle(10); //BN:4 kez aynı linke tıklamak yerine myFunc.bekle (Bekletme) ekledim




    }



}
