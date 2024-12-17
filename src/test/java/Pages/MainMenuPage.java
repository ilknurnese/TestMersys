package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage extends ParentPage {
    public MainMenuPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@placeholder='Kullanıcı Adı']")
    public WebElement userName;

    @FindBy(xpath = "//*[@placeholder='Parola']")
    public WebElement passWord;

    @FindBy(xpath = "//*[text()=' GİRİŞ YAP ']")
    public WebElement loginTo;

    @FindBy(xpath = "//*[text()='Assignments']")
    public WebElement Assignments;

    @FindBy(xpath = "//*[@class='cdk-overlay-container']")
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


    // US 6,7,8,9
    //binController
    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]//span[2]")
    public WebElement hamburgerMenuButton;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingButton;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trashButton;

    @FindBy(xpath = "(//tbody//td//button)[2]")
    public WebElement restoreIcon;

    @FindBy(xpath = "(//tbody//td//button)[3]")
    public WebElement deleteIcon;

    @FindBy(xpath = "(//button[@type='submit']//span)[2]")
    public WebElement deleteToTrashBox;


    //deleteOutMessaging
    @FindBy(xpath = "(//tbody//td//button)[2]")
    public WebElement message;

    @FindBy(xpath = "//span[text()='Move to Trash']")
    public WebElement moveToTrash;

    @FindBy(xpath = "//mat-dialog-actions[@class='mat-mdc-dialog-actions mdc-dialog__actions']//div//button")
    public WebElement confirmDeleteYes;


    //finance
    @FindBy(xpath = "//span[text()='Finance']")
    public WebElement finance;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinance;

    @FindBy(xpath = "(//tbody//td)[2]")
    public WebElement financePageIsDisplayed;


    //studentBalanceDetails
    @FindBy(xpath = "(//tbody//td//div//span)[1]")
    public WebElement studentName;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outBoxButton;

    @FindBy(xpath = "(//div[@role='tab'])[2]")
    public WebElement balanceDetailsButton;

    @FindBy(xpath = "//table//tbody//tr[1]//td[4]")
    public WebElement detailPage;


}
