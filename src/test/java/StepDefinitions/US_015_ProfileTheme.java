package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class US_015_ProfileTheme {

    MainMenuPage MMP = new MainMenuPage();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));


    @Then("User should see theme dropdown in the Settings page")
    public void userShouldSeeThemeDropdown() {
        wait.until(ExpectedConditions.visibilityOf(MMP.themeDropdownMenu));
        Assert.assertTrue(MMP.themeDropdownMenu.isDisplayed(), "Theme dropdown not visible!");
    }

    @And("Verify theme options are available")
    public void verifyThemeOptionsAvailable(io.cucumber.datatable.DataTable themes) {

        MMP.themeDropdownMenu.click();
        List<String> themeOptions = themes.asList();
        for (String theme : themeOptions) {
            System.out.println("theme = " + theme);
            Assert.assertTrue(MMP.getThemeOption(theme).isDisplayed(), "Theme option not visible: " + theme);
        }

    }


    @Then("Verify theme changed to {string}")
    public void verifyThemeChanged(String expectedTheme) {
        // Mevcut href değerini loglamak için eklendi
        System.out.println("Current href value (before waiting): " + MMP.selectedThemeLink.getAttribute("href"));

        // Tema değişikliğinin gerçekleşmesini bekliyoruz
        wait.until(ExpectedConditions.attributeContains(MMP.selectedThemeLink, "href", expectedTheme));

        // Bekleme sonrası tekrar href değerini kontrol ediyoruz
        System.out.println("Current href value (after waiting): " + MMP.selectedThemeLink.getAttribute("href"));

        // Tema değişikliğini doğruluyoruz
        Assert.assertTrue(
                MMP.selectedThemeLink.getAttribute("href").contains(expectedTheme),
                "Theme did not change to: " + expectedTheme
        );
    }


    @Then("Confirm Profile Theme Success Message")
    public void confirmProfileThemeSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(MMP.successMessage));
        Assert.assertTrue(MMP.successMessage.isDisplayed(), "Success message not displayed!");
        Assert.assertEquals(MMP.successMessage.getText(), "Success", "Success message text mismatch!");
    }

    @When("Select {string} theme from the dropdown")
    public void selectThemeFromTheDropdown(String theme) {
        MMP.selectTheme(theme);

    }


}
