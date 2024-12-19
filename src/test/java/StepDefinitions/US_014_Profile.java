package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class US_014_Profile {
    MainMenuPage MMP = new MainMenuPage();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    Robot robot;

    public US_014_Profile() {
        try {
            this.robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException("Robot initialization failed!", e);
        }
    }

    @And("Click on the Element in Dialog")
    public void click_on_the_element_in_dialog(io.cucumber.datatable.DataTable dataTable) {
        for (String element : dataTable.asList()) {
            switch (element) {
                case "profileMenu":
                    MMP.myClick(MMP.profileMenu);
                    break;
                case "settings":
                    MMP.myClick(MMP.settings);
                    break;
                case "uploadPicture":
                    MMP.myClick(MMP.uploadPicture);
                    break;
                case "uploadPictureButton":
                    MMP.myClick(MMP.uploadPictureButton);
                    break;
                case "uploadButton":
                    MMP.myClick(MMP.uploadButton);
                    MyFunc.Bekle(5);
                    break;
                case "saveButton":
                    MyFunc.Bekle(2);
                    MMP.myClick(MMP.saveButton);
                    break;
                default:
                    throw new IllegalArgumentException("Element not defined: " + element);
            }
        }
    }

    @And("Upload the picture")
    public void uploadThePicture() {

        MyFunc.Bekle(2);

        StringSelection filePath = new StringSelection("C:\\Users\\i_nes\\4.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);




    }

    @Then("Confirm Success Message")
    public void confirmSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(MMP.profileSuccessfullyUpdated));
        Assert.assertTrue(MMP.profileSuccessfullyUpdated.isDisplayed(), "Success message not displayed!");
        Assert.assertEquals(MMP.profileSuccessfullyUpdated.getText(), "Profile successfully updated");
    }
}
