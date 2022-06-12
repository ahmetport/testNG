package tests.day21_Reusabla_HtmlReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class EvÖdeviReports extends TestBaseRapor {

    // amazon sayfasina gidip
    // nutella icin arama yapalim
    // sonuc sayisinin 1000'den az oldugunu test edelim


    // amazon sayfasina gidip
    // electronic kategorisinde java icin arama yapalim
    // cikan sonuclardan ilkinin isminde java oldugunu test edelim

    //amazon sayfasına gidip
    // samsung için arama yapın
    //sonuç sayısısnın 1000 den az oldugunu test edin


    @Test
    public void test1() {
        extentTest = extentReports.createTest("nutella testi", "sonuç sayısı 1000 den az olmalı");
        // amazon sayfasina gidip
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("amazon sayfasına gidildi");

        // nutella icin arama yapalim
        WebElement aramakutusu = Driver.getDriver().findElement(By.id("twotabsearchtext"));
        aramakutusu.sendKeys(ConfigReader.getProperty("amazonArananKelime") + Keys.ENTER);
        extentTest.info("nutella için arama yapıldı");

        // sonuc sayisinin 1000'den az oldugunu test edelim
        // 1-48 of 125 results for "nutella"
        String sonuçYazısı = amazonPage.sonuçYazısıElementi.getText();
        System.out.println(sonuçYazısı);

        String sonuçArray[] = sonuçYazısı.split(" ");
        int sonuçYazısı1 = Integer.parseInt(sonuçArray[2]);
        extentTest.info("sonuç yazısı ınteger haline geldi");
        Assert.assertTrue(sonuçYazısı1 < 1000);
        extentTest.pass("sonuç sayısının 1000 den az oldugu tes edildi");


    }

    @Test
    public void test02() {
        // amazon sayfasina gidip
        // electronic kategorisinde java icin arama yapalim
        // cikan sonuclardan ilkinin isminde java oldugunu test edelim
        extentTest = extentReports.createTest("java testi", "ilk üründe java olmalı");
        // amazon sayfasina gidip
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("amazon sayfasına gidildi");

        // electronic kategorisinde java icin arama yapalim
        amazonPage.ddp.click();
        Select select = new Select(amazonPage.ddp);
        select.selectByIndex(10);
        extentTest.info("drapdown dan electronics seçildi");
        amazonPage.aramaKutusu.sendKeys("java" + Keys.ENTER);
        extentTest.info("java kelimesi aratıdı");

        // cikan sonuclardan ilkinin isminde java oldugunu test edelim
        WebElement ikinciÜrünElementi = Driver.getDriver().findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
        String ikinciElementYazısı = ikinciÜrünElementi.getText();
        Assert.assertFalse(ikinciElementYazısı.contains("java"));
        extentTest.pass("ikinci ürün oldugunda java geçtigi test edildi");

    }

    @Test
    public void test03() {
        //amazon sayfasına gidip
        // samsung için arama yapın
        //sonuç sayısısnın 1000 den az oldugunu test edin
        extentTest = extentReports.createTest("samsung testi", "sonuç sayısının 1000 den az oldugu test edelim");
        // amazon sayfasina gidip
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("amazon sayfasına gidildi");
        amazonPage.aramaKutusu.sendKeys("samsung"+ Keys.ENTER);
        extentTest.info("samsung aratması yapıldı");
        //sonuç sayısısnın 1000 den az oldugunu test edin
        WebElement samsungSonuçYazısı=Driver.getDriver().findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String sonuç=samsungSonuçYazısı.getText();

        String sonuçArray[]=sonuç.split(" ");
        String sonuçAdedi=sonuçArray[3];
        extentTest.info("sonuç yazısı arraye çevrildi");
         sonuçAdedi=sonuçAdedi.replace(",","");//ıntegrde nokta oldugundan dolayı yaptık
        System.out.println(sonuçAdedi);//sonuçadedi burda hala string odugundan ıntegerparse kullandık
        int sonuçRakamı=Integer.parseInt(sonuçAdedi);
        extentTest.info("sonuçyazısı ınteger halıne cevirildi");

        Assert.assertTrue(sonuçRakamı<1000);
        extentTest.pass("test başarı ile kaydedildi");



    }
}
