package StepDefinitions;

import Pages.DetailsPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class US_003_HamburgerSteps {



    DetailsPage dp = new DetailsPage();

    @When("Click on the element")
    public void clickOnTheElement(DataTable dtClick) {
        List<String> listClick = dtClick.asList();

        MyFunc.Bekle(2);
        for (String e : listClick){
            dp.myClick(dp.getWebElement(e));
        }


    }

    @Then("Send a message")
    public void sendAMessage(DataTable dtSendKeys) {
        List<List<String>> listSendKeys = dtSendKeys.asLists();

        MyFunc.Bekle(2);
        for (int i = 0; i < listSendKeys.size(); i++) {
            dp.mySendKeys(dp.getWebElement(listSendKeys.get(i).get(0)),listSendKeys.get(i).get(1));

        }
    }

    @And("Mission done successfully element")
    public void missionDoneSuccessfullyElement(DataTable dtelement) {
        List<String> listelement = dtelement.asList();

        for (String e : listelement){
            dp.veriftisDisplaydText(dp.getWebElement(e));
        }
    }


    @Then("İFrame Send  message")
    public void iframeSendMessage() {
        MyFunc.Bekle(2);
        GWD.getDriver().switchTo().frame(0);
        dp.mySendKeys(dp.iframeFile,"How can ı create a new branch from my repo?");
        GWD.getDriver().switchTo().parentFrame();
        GWD.getDriver().switchTo().defaultContent();
    }

    @Then("File upload")
    public void fileUpload() throws AWTException {

        Robot rbt = new Robot();

        MyFunc.Bekle(2);
        StringSelection dosyayolu = new StringSelection("C:\\Users\\Muhammet  YAZICI\\OneDrive\\Masaüstü\\Assign_Intern.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyayolu,null);

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);

        for (int i = 1; i <=2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        MyFunc.Bekle(2);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
    }
}
