package tests.practıce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusablaMethods;
import utilities.TestBaseRapor;

import java.time.Duration;

public class TradylinnTest extends TestBaseRapor {
    @Test
    public void testTradylinn() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("cupon testi", "cuponlara kısıt getirebilmeli");
        TradylinnPage portiPage = new TradylinnPage();

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Tradylinn ana sayfasına gidildi");

        portiPage.loginButton.click();
        extentTest.info("Login'e tiklandi");

        portiPage.username.sendKeys(ConfigReader.getProperty("correctEmail"));
        portiPage.password.sendKeys(ConfigReader.getProperty("correctPassword"));
        portiPage.loginButton2.click();
        extentTest.info("Geçerli mail ve şifre girildi ve giriş yapıldı");
        Thread.sleep(5000);
        portiPage.hesabimButton.click();
        extentTest.info("Hesabim butonuna basildi");
        portiPage.storeManagerButton.click();
        extentTest.info("Store manager butonuna tiklandi.");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        portiPage.kuponlar.click();
        portiPage.yeniEkle.click();
        portiPage.code.sendKeys("500");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
       // WebElement newCoupon=Driver.getDriver().findElement(By.xpath("//*[text()='"+portiPage.codeID+"']"));
        ReusablaMethods.waitFor(10);
        portiPage.minumumSpend.sendKeys("3");
        portiPage.maxSpend.sendKeys("5");
       // actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        JavascriptExecutor js2= (JavascriptExecutor) Driver.getDriver();
        js2.executeScript("arguments[0].click();",portiPage.ındividualCheckBox);
        js2.executeScript("arguments[0].click();",portiPage.excludeCheckBox);
        //portiPage.ındividualCheckBox.click();
       // portiPage.excludeCheckBox.click();

       // JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        //WebElement signInButonu= Driver.getDriver().findElement(By.xpath("(//span[text()='Sign in'])[2]"));
        //Thread.sleep(3000);
        //jse.executeScript("arguments[0].scrollIntoView(true);",signInButonu);
        // sign in butonuna js ile click yapalim
        //jse.executeScript("arguments[0].click();",signInButonu);
        //Thread.sleep(3000);

       // WebElement ddp=Driver.getDriver().findElement(By.xpath("(//input[@class='select2-search__field'])[4]"));
       // JavascriptExecutor js1= (JavascriptExecutor) Driver.getDriver();
        //js1.executeScript("arguments[0].click();",portiPage.ddp);
         //Select select = new Select(portiPage.ddp);
         //select.selectByIndex(1);

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",portiPage.submitTıkla);
        //portiPage.submitTıkla.click();



    }
}