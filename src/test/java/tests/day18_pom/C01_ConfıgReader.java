package tests.day18_pom;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_ConfıgReader {

    @Test
    public void test01() {

       //Driver.getDriver().get("amazonUrl");
       // Driver.getDriver().get("facebookUrl");

        Driver.getDriver().get((ConfigReader.getProperty("amazonUrl")));
      // Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
      // Driver.closeDriver();



    }
}
