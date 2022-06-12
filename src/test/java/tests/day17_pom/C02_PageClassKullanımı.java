package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanımı {

    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();

       //amazona gideli
       Driver.getDriver().get("https://www.amazon.com");
       //nutella aratalım
        amazonPage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);
        //sonuç yazısının nutella içerdigini test edelim
        String actualSonuç=amazonPage.aramaSonuçElementi.getText();
        String arananKelime="nutella";

        Assert.assertTrue(actualSonuç.contains(arananKelime));





    }
}
