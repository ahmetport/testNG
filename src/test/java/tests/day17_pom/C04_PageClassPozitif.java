package tests.day17_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmyCampPage;
import utilities.Driver;

public class C04_PageClassPozitif {

    /*
   1) Bir Class olustur : HotelmycampPositiveTest
   2) Bir test method olustur positiveLoginTest()
        https://www.hotelmycamp.com/ adresine git
        login butonuna bas
        test data username: manager
        test data password : Manager1!
        Degerleri girildiginde sayfaya girilebiidigini test test et
    */
    @Test

    public void test01() {
        HotelmyCampPage hotelmyCampPage = new HotelmyCampPage();
        Driver.getDriver().get("https://www.hotelmycamp.com/");
       // HotelmyCampPage hotelmyCampPage = new HotelmyCampPage();
        hotelmyCampPage.logınTuşu.click();
        hotelmyCampPage.isimKutusu.sendKeys("manager");
        hotelmyCampPage.şifreKutusu.sendKeys("Manager1!");
        hotelmyCampPage.logınTuşunaBas.click();
       Assert.assertTrue(hotelmyCampPage.managerPozitif.isDisplayed());
    }
}