package StepDefinitions;

import Pages.MainMenuPage;
import io.cucumber.java.en.Then;

public class Search {
    @Then("Click on SearchBtn")
    public void clickOnSearchBtn() {

        MainMenuPage MMP=new MainMenuPage();
        MMP.myClick(MMP.SearchBtn);

    }
}
