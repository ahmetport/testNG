package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcPageTest {

    /*

1. Tests packagenin altına class olusturun: D19_BRCar
2. Bir metod olusturun: bRCar
3. https://www.bluerentalcars.com/ sayfasina gidin.
4. Login butonuna tiklayin
5. Email alanina : ilk@er.com.tr
6. Password alanina : 1234567
7. Login e tiklayn
8. Siteye uye girisi basarili bir sekilde yapilabildigini dogrulayin.
9. Contact butonuna tiklayin
10. Call Center in goruntulendigini dogrulayin.


 */
    @Test
    public void test01() {
        BrcPage brcPage = new BrcPage();
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        brcPage.ilkLoginButonu.click();
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidUser"));
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPass"));
        brcPage.ikinciLoginButtonu.click();

        //8. Siteye uye girisi basarili bir sekilde yapilabildigini dogrulayin.
        String actualUsername=brcPage.kullanıcıProfilİsmi.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsernam");
        Assert.assertEquals(actualUsername,expectedUsername);

        //9. Contact butonuna tiklayin
        brcPage.contact.click();

        //10. Call Center in goruntulendigini dogrulayin.
      Assert.assertTrue(brcPage.callCenter.isDisplayed());

       //11.call center iletişim bilgilrini ekrana yazdırın
        System.out.println(brcPage.yazıElementi.getText());
        Driver.closeDriver();










    }
}
