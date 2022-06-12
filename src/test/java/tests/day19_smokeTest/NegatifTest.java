package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifTest {


    /*
   Bir test method olustur negatifLoginTest()
         https://www.bluerentalcars.com/ adresine git
        login butonuna bas
  test data user email: customer@bluerentalcars.com ,
  test data password : 54321
  login butonuna tiklayin
  Degerleri girildiginde sayfaya girilemedigini test edin
 */

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        BrcPage brcPage = new BrcPage();
        brcPage.ilkLoginButonu.click();
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        brcPage.ikinciLoginButtonu.click();
       // Degerleri girildiginde sayfaya girilemedigini test edin
       Assert.assertTrue(brcPage.ikinciLoginButtonu.isDisplayed());
       Driver.closeDriver();
    }
}
