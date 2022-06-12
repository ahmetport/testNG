package tests.day21_Reusabla_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_pozitifLogınTestiRoporlu extends TestBaseRapor {

    @Test
    public void test01() {
        extentTest=extentReports.createTest("pozitif Logın","geçerli Username Ve Şifre ile Giriş Yapabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya Gidildi");
        BrcPage brcPage = new BrcPage();
        brcPage.ilkLoginButonu.click();
        extentTest.info("logın butonuna tıklandı");
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("geçerli email yazıldı");
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        brcPage.ikinciLoginButtonu.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUserName = brcPage.kullanıcıProfilİsmi.getText();
        String expectedUsername = ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUserName, expectedUsername);
        extentTest.pass("kullanıcı başarılı şekilde giriş yapıldı");
         Driver.closeDriver();
    }
}