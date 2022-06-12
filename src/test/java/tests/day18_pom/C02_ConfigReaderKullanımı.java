package tests.day18_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanımı {


    @Test
    public void test01() {
        FacebookPage facebookPage=new FacebookPage();
        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        //kullanıcı mail kutusuna  yanlış kullanıcı adı yazdırın
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUsername"));
        //kullanıcı şifre kutusuna  bir password yazdırın
       facebookPage.şifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongPassword"));
        //logın butonuna basın
        facebookPage.loginKutusu.click();
        //giriş yapılamadıgını test edin
        Assert.assertTrue(facebookPage.girilemediYazıElementi.isDisplayed());
        //sayfayı kapatın
        Driver.closeDriver();
    }
    }

