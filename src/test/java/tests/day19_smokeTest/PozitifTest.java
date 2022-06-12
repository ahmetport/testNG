package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifTest {

     /*
   Bir test method olustur positiveLoginTest()
         https://www.bluerentalcars.com/ adresine git
        login butonuna bas
  test data user email: customer@bluerentalcars.com ,
  test data password : 12345
  login butonuna tiklayin
  Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
 */

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        BrcPage brcPage = new BrcPage();
        brcPage.ilkLoginButonu.click();
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        brcPage.ikinciLoginButtonu.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUserName=brcPage.kullanıcıProfilİsmi.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUserName,expectedUsername);
        Driver.closeDriver();




















    }
}
