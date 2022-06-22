package tests.practıce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.time.Duration;

public class TradylinnTest extends TestBaseRapor {
    @Test
    public void testTradylinn() throws InterruptedException {
        extentTest = extentReports.createTest("cupon testi", "cuponlara kısıt getirebilmeli");
        TradylinnPage tdPage = new TradylinnPage();
        Driver.getDriver().get("https://Tradylinn.com/wp_admin");

        tdPage.hesabımLogınTıkla.click();
        tdPage.eMailAdress.sendKeys("umitenes89@gmail.com");
        tdPage.password.sendKeys("Ahmet27,.");
        Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        tdPage.girişYapBtn.click();
        Thread.sleep(3000);

        tdPage.storeManager.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tdPage.kuponlar.click();
        tdPage.yeniEkle.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        tdPage.restrictionTıkla.click();
        Thread.sleep(3000);

        tdPage.minumumSpend.sendKeys("3");
        tdPage.maxSpend.sendKeys("5");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tdPage.ındividualCheckBox.click();
        tdPage.excludeCheckBox.click();



        WebElement ddp=Driver.getDriver().findElement(By.xpath("(//input[@class='select2-search__field'])[4]"));
        Select select = new Select(ddp);
         select.selectByIndex(1);


    }
}