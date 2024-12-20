package StepDefinitions;

import Pages.DetailsPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class US_002_HomeSteps {

    DetailsPage dp = new DetailsPage();


    @And("Click on the company logo")
    public void clickOnTheCompanyLogo() {
        dp.myClick(dp.logo);
    }

    @And("Mission done successfully")
    public void missionDoneSuccessfully(String element) {

        for (String window : GWD.getDriver().getWindowHandles()) {
            GWD.getDriver().switchTo().window(window);
        }

        dp.veriftisDisplaydText(dp.getWebElement(element));
    }


    @Given("Click top menu elements and new page success")
    public void clickTopMenuElementsAndNewPageSuccess(DataTable dtTopMenu) {
        List<List<String>>  listTopMenu = dtTopMenu.asLists();

        for (int i = 0; i < listTopMenu.size(); i++) {
            dp.myClick(dp.getWebElement(listTopMenu.get(i).get(0)));
            dp.veriftisDisplaydText(dp.getWebElement(listTopMenu.get(i).get(1)));

        }

    }


}
