package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends ParentPage{

    public DetailsPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }



    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement passWord;

    @FindBy(xpath = "//*[text()=' GİRİŞ YAP ']")
    public WebElement loginButon;


    @FindBy(xpath = "//*[@class='logo-text ng-star-inserted'][text()='Internship']")
    public WebElement intership;

    @FindBy(xpath = "//student-toolbar-horizontal//div//div//div//div/img")
    public WebElement logo;

    @FindBy(xpath = "//div[text()='Learn new skills.']")
    public WebElement learnNew;

    @FindBy(xpath = "//ms-layout-menu-button[contains(caption,'')][1]//span[@class='mat-focus-indicator']")
    public WebElement courses;

    @FindBy(xpath = "//ms-layout-menu-button[contains(caption,'')][2]//span[@class='mat-focus-indicator']")
    public WebElement calendar;

    @FindBy(xpath = "//ms-layout-menu-button[contains(caption,'')][3]//span[@class='mat-focus-indicator']")
    public WebElement attendance;

    @FindBy(xpath = "//ms-layout-menu-button[contains(caption,'')][4]//span[@class='mat-focus-indicator']")
    public WebElement assigments;

    @FindBy(xpath = "//ms-layout-menu-button[contains(caption,'')][5]//span[@class='mat-focus-indicator']")
    public WebElement grading;

    @FindBy(xpath = "(//ms-layout-menu-button[@page='GRADING']/following-sibling::span)[1]//button")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//user-announcement-bell//span//following-sibling::div//following-sibling::span[1]")
    public WebElement  anouncements;

    @FindBy(xpath = "//user-message-bell//span//following-sibling::span[@class='mat-focus-indicator']")
    public WebElement message;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/button/span[3]")
    public WebElement profil;

    @FindBy(xpath = "//span[text()=' Welcome, Student_10 11A ! ']")
    public WebElement welcome;

    @FindBy(xpath = "//mat-tab-header//div[@role='tab'][@aria-posinset='1']")
    public WebElement weeklyCoursePlan;

    @FindBy(xpath = "//mat-tab-header//span[text()=' ACADEMIC YEAR ']")
    public WebElement academicYear;

    @FindBy(xpath = "//span[text()=' Assignments ']")
    public WebElement assiglocator;

    @FindBy(xpath = "//span[text()=' Grading ']")
    public WebElement gradLoc;

    @FindBy(xpath = "//div[@role='menu'][1]")
    public WebElement Hmenu;

    @FindBy(xpath = "//*[@id=\"mat-mdc-dialog-6\"]/div/div/announcement-list-dialog/ms-dialog/ms-dialog-content/div/ms-announcement-board/div/div[2]/button[1]/span[2]")
    public WebElement zil;

    @FindBy(xpath = "//div[text()=' Sent Time ']")
    public WebElement sentTime;

    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement singOut;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-5\"]")
    public WebElement messagingMenu;

    @FindBy(xpath = "//*[text()='Send Message']")
    public WebElement sendMessaging;

    @FindBy(xpath = "//*[text()='Inbox']")
    public WebElement inbox;

    @FindBy(xpath = "//*[text()='Outbox']")
    public WebElement outbox;

    @FindBy(xpath = "//*[text()='Trash']")
    public WebElement trash;

    @FindBy(xpath = "//*[text()='Send']")
    public WebElement send;

    @FindBy(xpath = "//ms-browse/div")
    public WebElement inboxTablo;

    @FindBy(xpath = "//ms-browse/div")
    public WebElement outboxTablo;

    @FindBy(xpath = "//*[text()=' Trash ']")
    public WebElement trashKontrol;




    public WebElement getWebElement(String kelime) {

        switch (kelime) {
            case "courses": return this.courses;
            case "calendar": return this.calendar;
            case "attendance": return this.attendance;
            case "assigments": return this.assigments;
            case "grading": return this.grading;
            case "hamburgerMenu": return this.hamburgerMenu;
            case "anouncements": return this.anouncements;
            case "message": return this.message;
            case "profil": return this.profil;
            case "welcome": return this.welcome;
            case "weeklyCoursePlan": return this.weeklyCoursePlan;
            case "academicYear": return this.academicYear;
            case "assiglocator": return this.assiglocator;
            case "gradLoc": return this.gradLoc;
            case "Hmenu": return this.Hmenu;
            case "zil": return this.zil;
            case "sentTime": return this.sentTime;
            case "singOut": return this.singOut;
            case "messaging": return this.messaging;
            case "messagingMenu": return this.messagingMenu;
            case "sendMessaging": return this.sendMessaging;
            case "inbox": return this.inbox;
            case "outbox": return this.outbox;
            case "trash": return this.trash;
            case "send": return this.send;
            case "inboxTablo": return this.inboxTablo;
            case "outboxTablo": return this.outboxTablo;
            case "trashKontrol": return this.trashKontrol;
            case "addButton": return this.addButton;
            case "subject": return this.subject;
            case "iframe": return this.iframe;
            case "nameSend": return this.nameSend;
            case "sendButton": return this.sendButton;
            case "student2": return this.student2;
            case "student5": return this.student5;
            case "teacher3": return this.teacher3;
            case "iframeAdd": return this.iframeAdd;
            case "addAndClose": return this.addAndClose;
            case "successMessage": return this.successMessage;
            case "attachFile": return this.attachFile;
            case "fromLocal": return this.fromLocal;
            case "sendVia": return this.sendVia;
            case "Email": return this.Email;
            case "receivers": return this.receivers;
            case "stuElement2": return this.stuElement2;
            case "stuElement5": return this.stuElement5;
            case "teaElement3": return this.teaElement3;
            case "FileMesseage": return this.FileMesseage;
            case "iframeFile": return this.iframeFile;
            case "dosyaKontrol": return this.dosyaKontrol;
            case "messageSuccessfully": return this.messageSuccessfully;


        }
    return null;

    }


    @FindBy(xpath = "//ms-button[@tooltip='USER_MESSAGES.BUTTONS.RECEIVER']/button//span[@class='mat-focus-indicator']")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='USER_MESSAGES.TITLE.SUBJECT']//input")
    public WebElement subject;

    @FindBy(xpath = "//iframe")
    public WebElement iframe;

    @FindBy(xpath = "//input[@placeholder='Name, Username or E-mail']")
    public WebElement nameSend;

    @FindBy(xpath = "//ms-button[@caption='USER_MESSAGES.BUTTONS.SEND']//span[@class='mat-focus-indicator']")
    public WebElement sendButton;

    @FindBy(xpath = "(//tbody[@class='mdc-data-table__content ng-star-inserted']//tr)[2]")
    public WebElement student2;

    @FindBy(xpath = "(//tbody[@class='mdc-data-table__content ng-star-inserted']//tr)[5]")
    public WebElement student5;

    @FindBy(xpath = "(//tbody//tr)[3]")
    public WebElement teacher3;

    @FindBy(xpath = "(//ms-dialog-buttons//ms-button[@color='accent'])[1]//span[@class='mat-focus-indicator']")
    public WebElement iframeAdd;

    @FindBy(xpath = "(//ms-dialog-buttons//ms-button[@color='accent'])[2]//span[@class='mat-focus-indicator']")
    public WebElement addAndClose;

    @FindBy(xpath = "//*[text()='Users (Fullname, Username or E-mail) was successfully added']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[text()='Attach Files...']")
    public WebElement attachFile;

    @FindBy(xpath = "//*[text()='From Local']")
    public WebElement fromLocal;

    @FindBy(xpath = "//mat-select[@role='combobox']")
    public WebElement sendVia;

    @FindBy(xpath = "//mat-option[@value='EMAIL']")
    public WebElement Email;

    @FindBy(xpath = "//mat-chip-grid[@focused='unFocus']")
    public WebElement receivers;

    @FindBy(xpath = "(//mat-chip-grid[@focused='unFocus']//mat-chip-row)[1]")
    public  WebElement stuElement2;

    @FindBy(xpath = "(//mat-chip-grid[@focused='unFocus']//mat-chip-row)[2]")
    public  WebElement stuElement5;

    @FindBy(xpath = "(//mat-chip-grid[@focused='unFocus']//mat-chip-row)[3]")
    public  WebElement teaElement3;

    @FindBy(xpath = "/html")
    public WebElement FileMesseage;

    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement iframeFile;

    @FindBy(xpath = "//file-upload[@appname='gateway']")
    public WebElement dosyaKontrol;

    @FindBy(xpath = "//*[text()='Message Successfully sent']")
    public WebElement messageSuccessfully;







}
