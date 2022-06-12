package tests.day21_Reusabla_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusablaMethods;

import java.util.Set;

public class C01_WındowHandleReusableMethod {
    @Test
    public void test01() {
        // //https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();

        //CLİCK HERE BUTONUNA BASIN
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandkeSeti = Driver.getDriver().getWindowHandles();

        String ikinciSayfaWındowHandleDgeri = "";
        for (String each : windowHandkeSeti
        ) {
            if (each.equals(ilkSayfaHandleDegeri)) {
                ikinciSayfaWındowHandleDgeri = each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWındowHandleDgeri);
        System.out.println(Driver.getDriver().getTitle());
        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @Test
    public void test02() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusablaMethods.switchToWindow("New Window");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();



















    }
}
