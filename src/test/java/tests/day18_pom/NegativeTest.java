package tests.day18_pom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelmyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NegativeTest {

    /*
   1) Bir Class olustur : HotelmycampPositiveTest
   2) Bir test method olustur positiveLoginTest()
        https://www.hotelmycamp.com/ adresine git
        login butonuna bas
        test data username: manager1
        test data password : Manager1!
        Degerleri girildiginde sayfaya girilemedigini test et
    */
    @Test
    public void test01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampPageUrl"));
        HotelmyCampPage hotelmyCampPage = new HotelmyCampPage();
        hotelmyCampPage.logınTuşu.click();
        hotelmyCampPage.isimKutusu.sendKeys(ConfigReader.getProperty("wrongUsername"));
        hotelmyCampPage.şifreKutusu.sendKeys(ConfigReader.getProperty("wrongPassword"));
        hotelmyCampPage.logınTuşunaBas.click();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelmyCampPage.girilemediYazısı.isDisplayed(),"tekrar deneyin yazısı gözüküyor");
        softAssert.assertAll();


      //aşagı kısım tamamen görsellik
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
        String tarih = date.format(dtf);

        File tumSayfaResim = new File("target/ekranGoruntuleri/girişYokYassak" + tarih + ".jpeg");
        File geciciDosya = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciDosya, tumSayfaResim);

        Driver.getDriver().close();

    }
}