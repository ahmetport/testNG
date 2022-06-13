package tests.practıce;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

public class Q4_Alert_DependsOn {
       /*
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2. CLICK ME of JavaScript Alert e tıklayın
     // 3. pop up text i alın
     // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
     // 5. pop up i kabul edin
     // Yine ayni class da baska test methodu olusturun
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
     // 3.  pop up text i alın
     // 4. Mesajın "Press a button!" olduğunu doğrulayın
     // 5. Açılır pencereyi kapat
     // 6. pop up i iptal edin,
     // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
     // 8. alert1'e göre dependsOnMethods kullanın
 */
    @Test
    public void test() {
        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2. CLICK ME of JavaScript Alert e tıklayın
        // 3. pop up text i alın
        // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
        // 5. pop up i kabul edin
        Driver.getDriver().findElement(By.id("button1")).click();
        String actualmessage=Driver.getDriver().switchTo().alert().getText();
        String expectedMessage="I am an alert box!";
        Assert.assertEquals(actualmessage,expectedMessage);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Test
    public void testalert() {
        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
        // 3.  pop up text i alın
        // 4. Mesajın "Press a button!" olduğunu doğrulayın
        // 5. Açılır pencereyi kapat
        // 6. pop up i iptal edin,
        // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
        // 8. alert1'e göre dependsOnMethods kullanın
        Driver.getDriver().findElement(By.xpath("//span[@id='button4']")).click();
        System.out.println(Driver.getDriver().switchTo().alert().getText());
        String expectedMessage1="Press a button!";
        String actualmessage1=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualmessage1,expectedMessage1);

        Driver.getDriver().switchTo().alert().dismiss();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[@id='confirm-alert-text']")).isDisplayed());





















    }
}
