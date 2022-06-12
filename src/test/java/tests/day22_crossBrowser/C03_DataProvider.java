package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {
    @DataProvider
    public static Object[][] aranacakKelimeler() {
        Object[][] arananKelimeArrayı={{"nutella"},{"java"},{"çigdem"},{"netherlands"}};
        return arananKelimeArrayı;

    }

    @Test
    public void test01(){
        AmazonPage amazonPage = new AmazonPage();
        //amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella aratalım
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        //SONUÇLARIN NUTELLA İÇERDİGİNİ TEST EDELİM
        String expectedKelime="nutella";
        String actualYazısı=amazonPage.sonuçYazısıElementi.getText();

        Assert.assertTrue(actualYazısı.contains(expectedKelime));
        Driver.closeDriver();

    }


    @Test(dataProvider = "aranacakKelimeler")
    //arayacagımız kelimeleri bir liste gibi tutup bana yollayacak bir veri saglayıcı oluşturacagız
    public void testDataProvider(String arananKelime) {
        AmazonPage amazonPage = new AmazonPage();
        //amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella java çigdem ve netherland için arama yapın
        amazonPage.aramaKutusu.sendKeys("arananKelime"+ Keys.ENTER);
       // sonuçların aradıgımız kelime içerdidigini test edelim

        String expectedKelime="arananKelime";
        String actualYazısı=amazonPage.aramaSonuçElementi.getText();
        Assert.assertTrue(actualYazısı.contains(expectedKelime));

     Driver.closeDriver();







    }
}
