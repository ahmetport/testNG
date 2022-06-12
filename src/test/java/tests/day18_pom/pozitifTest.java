package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class pozitifTest {


    /*
   1) Bir Class olustur : HotelmycampPositiveTest
   2) Bir test method olustur positiveLoginTest()
        https://www.hotelmycamp.com/ adresine git
        login butonuna basA
        test data username: manager
        test data password : Manager1!
        Degerleri girildiginde sayfaya girilebiidigini test test et

     */

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampPageUrl"));
        HotelmyCampPage hotelmyCampPage=new HotelmyCampPage();
        hotelmyCampPage.logınTuşu.click();
        hotelmyCampPage.isimKutusu.sendKeys(ConfigReader.getProperty("correctUsername"));
        hotelmyCampPage.şifreKutusu.sendKeys(ConfigReader.getProperty("correctPassword"));
        hotelmyCampPage.logınTuşunaBas.click();
       Assert.assertTrue(hotelmyCampPage.managerPozitif.isDisplayed());
    }
}
