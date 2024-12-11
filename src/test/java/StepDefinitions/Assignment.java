package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.sql.ClientInfoStatus;
import java.util.List;

public class Assignment {
    MainMenuPage mmp=new MainMenuPage();

    @When("Click on Assignment")
    public void clickOnAssignment() {

        //AC_AS01_1:Ana sayfada, öğrencinin kendisine atanmış görevlerin bulunduğu bir sayfaya erişebileceği link
//(Assignments) olmalıdır.

        Assert.assertTrue(mmp.Assignments.getText().contains("Assignments"),"Assignment linki yoktur");


        //AC_AS01_2:Öğrenci, assignments linkine over-over yaptığında, kendisine atanan görevlerin toplam sayısını
        //görebilmelidir.

        //BN:Assignments linkinin üzerine mouse ile gidiyor
        Actions aksiyonlar=new Actions(GWD.getDriver());
        Action aksiyon=aksiyonlar.moveToElement(mmp.Assignments).build();
        aksiyon.perform();

        // System.out.println("Yazdırılan Değer-->"+mmp.OdevSayisi.getText()+"<--");

//BN:Öğrenciye atanmış ödev olup olmadığını görüyor

        Assert.assertTrue(!mmp.OdevSayisi.getText().equalsIgnoreCase(null),"Atanmış Ödev Yoktur");
        //  System.out.println(mmp.Assignments.getText());

//AC_AS01_3:Öğrenci,Assignments linkine tıkladığında,kendisine atanmış tüm görevleri görebiliyor
        mmp.myClick(mmp.Assignments);

        MyFunc.Bekle(10);
    }


}
