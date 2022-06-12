package tests.practıce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SauceDemoPage;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3_softAssert{

        /*
         * Navigate to  https://www.saucedemo.com/
         * Enter the user name  as standard_user
         * Enter the password as   secret_sauce
         * Click on login button
         *     T1 : Choose price low to high with soft Assert
         *     T2 : Verify item prices are sorted from low to high with hard Assert
         */
        // Verify item prices are sorted from low to high with hard Assert

  @Test
      public void sauceDemoSoft() {
      Driver.getDriver().get("https://www.saucedemo.com/");
      SauceDemoPage sdpage = new SauceDemoPage();
      sdpage.username.sendKeys("standard_user");
      sdpage.password.sendKeys("secret_sauce");
      sdpage.loginButton.click();
      Select select = new Select(sdpage.dropDown);
      select.selectByVisibleText("Price (low to high)");
      String expected = "PRICE (LOW TO HIGH)";
      String actual = select.getFirstSelectedOption().getText();
      System.out.println(sdpage.dropDown.getText());

      SoftAssert softAssert = new SoftAssert();
      softAssert.assertEquals(actual, expected);
      softAssert.assertAll();
  }

  @Test
  public void HardAssert(){
      //ürün fiyatlarının sıaralı oldugunu test edin
     // T2 : Verify item prices are sorted from low to high with hard Assert
      Driver.getDriver().get("https://www.saucedemo.com/");
      SauceDemoPage sdpage = new SauceDemoPage();
      sdpage.username.sendKeys("standard_user");
      sdpage.password.sendKeys("secret_sauce");
      sdpage.loginButton.click();


      Select select = new Select(sdpage.dropDown);
      select.selectByIndex(2);
      List<Double> UrunlerDouble=new ArrayList<Double>();
      for (WebElement each: sdpage.ürünlerListesi
           ) {
          String fiyatStr=each.getText().replaceAll("^\\D","");
          UrunlerDouble.add(Double.parseDouble(fiyatStr));
      }
     List<Double>kontrolListesi=new ArrayList<>(UrunlerDouble);
      Collections.sort(kontrolListesi);
      Assert.assertEquals(kontrolListesi,UrunlerDouble);



      }
}

