package StepDefinitions;

import Pages.MainMenuPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_013_Attendance {
    MainMenuPage MMP = new MainMenuPage();
    @When("I go to the notification section")
    public void iGoToTheNotificationSection() {
        MMP.myClick(MMP.HamburgerMenu);
        MMP.myClick(MMP.Attendance);
        MMP.myClick(MMP.AttendanceExcusesParents);
        MMP.myClick(MMP.Plus);


    }

    @Then("I write or upload the notification")
    public void iWriteOrUploadTheNotification() {
        MMP.mySendKeys(MMP.Message,"I won't be able to attend class today because I'm sick");
        MMP.myClick(MMP.AttachFiles);
        MMP.myClick(MMP.Send);
        MMP.myClick(MMP.Send);
    }
}
