package tests.day21_Reusabla_HtmlReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ReactShop;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

public class ReactShopRaporlu extends TestBaseRapor {

    // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
    // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
    // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
    // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
    // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
    // (Her ürün 1 defadan fazla eklenemez!)
    // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
    // 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
    // 7.Checkout'a tıklayın
    //Driver.quitDriver();

    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("alışveriş sitesi ","site sepete ekleme yapıp fiyatları otomatik topluyormu");

        ReactShop react=new ReactShop();
        Driver.getDriver().get("https://react-shopping-cart-67954.firebaseapp.com/");
        extentTest.info("siteye giriş yapıldı");

        // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
        // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
        List<WebElement>urunlerListesi=Driver.getDriver().findElements(By.xpath("//div[@tabindex='1']"));
        int sayaç=1;
        for (int i = 0; i <urunlerListesi.size() ; i++) {
            System.out.println(urunlerListesi.get(i).getText());
            sayaç++;

        }
        extentTest.info("sitedeki tüm ürünler seçildi");
        // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        List<String>urunİsimleri=new ArrayList<>();
        for (WebElement each:urunlerListesi
             ) {
            urunİsimleri.add(each.getText());
        }
        extentTest.info("ürün adları girildi");
        System.out.println("****************************************************************");
        // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
           List<WebElement>addCartButon=Driver.getDriver().findElements(By.xpath("//button[text()='Add to cart']"));
        for (int i = 11; i <=15 ; i++) {
            addCartButon.get(i).click();
            Thread.sleep(3000);
            react.çarpıİşareti.click();
            Thread.sleep(2000);
            System.out.println(urunlerListesi.get(i).getText());

        }
        extentTest.info("rastgele 5 öge seçildi ve sepete eklendi");
        Driver.getDriver().findElement(By.xpath("//div[@class='sc-1h98xa9-2 fGgnoG']")).click();
        // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
        WebElement sepetTıkla=Driver.getDriver().findElement(By.xpath("//button[@class='sc-1h98xa9-0 gFkyvN']"));
        sepetTıkla.click();
        WebElement toplamÖdeme=Driver.getDriver().findElement(By.xpath("//p[@class='sc-1h98xa9-9 jzywDV']"));
        System.out.println(toplamÖdeme.getText());
        extentTest.info("fiyatlar toplandı ve karşılaştırma yapıldı");
        // 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
        String expectedFiyat="$ 275.00";
        String actuallFiyat=toplamÖdeme.getText();
        Assert.assertEquals(actuallFiyat,expectedFiyat,"toplamlar eşit");
        // 7.Checkout'a tıklayın
        Driver.getDriver().findElement(By.xpath("//button[@class='sc-1h98xa9-11 gnXVNU']")).click();
        extentTest.pass("test başarılı şekilde yapıldı");



    }


}

