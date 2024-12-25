package StepDefinitions;

import Pages.MainMenuPage;
import io.cucumber.java.en.Then;

public class Calendar {
    @Then("Click on Calendar")
    public void clickOnCalendar() {
        MainMenuPage MMP=new MainMenuPage();
        MMP.myClick(MMP.Calendar);
        MMP.myClick(MMP.WCP);
    }
}
