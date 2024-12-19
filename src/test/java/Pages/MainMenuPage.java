package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MainMenuPage extends ParentPage {
  public MainMenuPage() {

    PageFactory.initElements(GWD.getDriver(), this);
  }

  // @FindBy(xpath = "//*[@placeholder='Kullanıcı Adı']")
  @FindBy(xpath = "//input[@placeholder='Username']")
  public WebElement userName;

  //@FindBy(xpath = "//*[@placeholder='Parola']")
  @FindBy(xpath = "//input[@placeholder='Password']")
  public WebElement passWord;

  //  @FindBy(xpath = "//*[text()=' GİRİŞ YAP ']")
  @FindBy(xpath = "//span[@class='mdc-button__label']")
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

  //Profile Picture Update
  @FindBy(xpath = "//span[@class='username mr-12']")
  public WebElement profileMenu;

  @FindBy(xpath = "//span[text()='Settings']")
  public WebElement settings;

  @FindBy(xpath = "//img[@class='profile-image avatar huge ng-star-inserted']")
  //@FindBy(xpath = "//img[contains(@class,'profile-image')]")
  public WebElement uploadPicture;

  //@FindBy(xpath ="//div[@id='cdk-describedby-message-ng-1-107' and text()='Upload Picture']")
//   @FindBy(xpath = "//*[contains(@class,'upload')]")
  @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mdc-fab mat-mdc-fab-base mdc-fab--mini mat-mdc-mini-fab mat-accent mat-mdc-button-base']//fa-icon[@class='ng-fa-icon']//*[name()='svg']")
  public WebElement uploadPictureButton;

  //@FindBy(xpath = "//span[text()=' Upload ']")
  ////span[@class='mdc-button__label' and normalize-space()='Upload']
  @FindBy(xpath = "//span[normalize-space()='Upload']")
  public WebElement uploadButton;


  // @FindBy(xpath = "//*[@data-icon='floppy-disk']")
  @FindBy(xpath = "//span[@class='mdc-button__label' and normalize-space()='Save']")
  public WebElement saveButton;

  @FindBy(xpath = "//button[@class='mat-mdc-accent mdc-button mat-mdc-button mat-mdc-raised-button mat-accent mat-mdc-button-base ng-star-inserted']//span[@class='mdc-button__label']")
  public WebElement profileSaveButton;

  @FindBy(xpath = "//div[text()='Profile successfully updated']")
  public WebElement profileSuccessfullyUpdated;

  @FindBy(xpath = "//mat-select[@formcontrolname='theme']")
  public WebElement themeDropdownMenu;

  @FindBy(xpath = "//mat-select[@formcontrolname='theme']")
  public WebElement profileThemeSelection;

  @FindBy(xpath = "//mat-option[@value='purple-theme']")
  public WebElement purpleThemeOption;

  @FindBy(xpath = "//mat-option[@value='dark-purple-theme']")
  public WebElement darkPurpleThemeOption;

  @FindBy(xpath = "//mat-option[@value='indigo-theme']")
  public WebElement indigoThemeOption;

  @FindBy(xpath = "//link[@id='pfThemeLoader']")
  public WebElement selectedThemeLink;

  @FindBy(xpath = "//span[normalize-space()='Welcome, Student_7 11A !']")
  public WebElement headText;


  @FindBy(xpath = "//div[contains(text(),\"Profile successfully updated\")]")
  public WebElement successMessage;

  public WebElement getThemeOption(String themeName) {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    String normalizedTheme = themeName.toLowerCase().replace(" ", "-");
    String xpath = String.format("//mat-option[contains(@value, '%s')]", normalizedTheme);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

  }


  public boolean isBackdropVisible() {
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
    return (boolean) js.executeScript("return document.querySelector('.cdk-overlay-backdrop') !== null;");
  }



  public void selectTheme(String theme) {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(profileThemeSelection));

    // Dropdown'u aç
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
    js.executeScript("arguments[0].click();", profileThemeSelection);

    // Overlay'in kaybolmasını bekle
    waitForBackdropToDisappear();

    // Temayı seç
    WebElement themeOption = getThemeOption(theme + "-theme");
    wait.until(ExpectedConditions.elementToBeClickable(themeOption));
    js.executeScript("arguments[0].click();", themeOption);

    System.out.println("Selecting theme: " + theme);

    // Seçim sonrası overlay'in yeniden çıkma ihtimaline karşı kontrol et
    waitForBackdropToDisappear();

  }

  public void waitForBackdropToDisappear() {

    int retry = 0;
    while (isBackdropVisible() && retry < 10) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      retry++;
    }
  }

}
