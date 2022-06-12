package tests.day21_Reusabla_HtmlReports;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusablaMethods;

import java.io.IOException;

public class C02_ScreenShot_ReusableMethod {
    @Test
    public void test01() throws IOException {
        //amazona gidip fotografını çekelim
        Driver.getDriver().get("https://www.amazon.com");
        ReusablaMethods.getScreenshot("amazon");
        Driver.closeDriver();
    }
}
