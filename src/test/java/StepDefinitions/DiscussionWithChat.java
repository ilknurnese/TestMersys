package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class DiscussionWithChat {
    MainMenuPage mmp=new MainMenuPage();
    @Then("Click on Discussion with chat")
    public void clickOnDiscussionWithChat() {

        mmp.myClick(mmp.discussionwithChat);
        MyFunc.Bekle(10);
        mmp.myClick(mmp.chat);
        MyFunc.Bekle(10);
        mmp.myClick(mmp.chat);
        mmp.myClick(mmp.chatstudents);
        mmp.mySendKeys(mmp.textarea,"new discussion from here");
        mmp.myClick(mmp.sendDiscussion);
//        mmp.myClick(mmp.attach);
        MyFunc.Bekle(10);
        new Actions(GWD.getDriver())
                .keyDown(Keys.ESCAPE)
                .build()
                .perform();

    }
}
