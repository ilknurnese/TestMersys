package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage extends ParentPage {
    public MainMenuPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//*[@placeholder='Kullanıcı Adı']")
    public WebElement userName;

    @FindBy(xpath = "//*[@placeholder='Parola']")
    public WebElement passWord;

    @FindBy(xpath = "//*[text()=' GİRİŞ YAP ']")
    public WebElement loginTo;

    @FindBy(xpath = "//*[text()='Assignments']")
    public WebElement Assignments;

    @FindBy(xpath="//*[@class='cdk-overlay-container']")
    public WebElement OdevSayisi; //.getText() deyince ödev sayısını veriyor


    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[26]")//23
    public WebElement Assignment;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[24]")
    public WebElement Submit;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[28]")
    public WebElement Discussion;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[29]")
    public WebElement markIt;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[45]")
    public WebElement students;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[16]")
    public WebElement backfromAssignment;

    @FindBy(xpath = "(//*[@fxlayoutalign='start center'])[19]")
    public WebElement bosluk;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[45]")
    public WebElement chat;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[46]")
    public WebElement chatstudents;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[35]")
    public WebElement discussionwithChat;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[79]")
    public WebElement sendDiscussion;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[76]")
    public WebElement attach;

    @FindBy(xpath = "//textarea")
    public WebElement textarea;

    @FindBy(xpath = "//*[@id='tinymce'] ")
    public WebElement hwSubmitTextArea;

    @FindBy(css = "ng-star-inserted ")
    public WebElement EndLessons;

    @FindBy(css = "ng-star-inserted ")
    public WebElement RecordinBtn;



}
