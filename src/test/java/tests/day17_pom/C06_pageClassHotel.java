package tests.day17_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmyCampPage;
import utilities.Driver;

public class C06_pageClassHotel {

     /*
    1) Bir Class olustur : HotelmycampPositiveTest
    2) Bir test method olustur positiveLoginTest()
         https://www.hotelmycamp.com/ adresine git
         login butonuna bas
         test data username: manager1
         test data password : Manager1!
         Degerleri girildiginde sayfaya girilemedigini test test et
     */

    @Test

    public void test01() {
        Driver.getDriver().get("https://www.hotelmycamp.com/");


        HotelmyCampPage hotelmyCampPage=new HotelmyCampPage();


        hotelmyCampPage.logınTuşu.click();
        hotelmyCampPage.isimKutusu.sendKeys("manager");
        hotelmyCampPage.şifreKutusu.sendKeys("Manager1!");
        hotelmyCampPage.logınTuşunaBas.click();
      // Assert.assertTrue( hotelmyCampPage.girilemediYazısı.isDisplayed());


    }
}
