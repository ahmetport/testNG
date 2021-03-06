package tests.day18_pom;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class E2Etesting {
    //1. Tests packagenin altına class olusturun: D17_CreateHotel
    //2. Bir metod olusturun: createHotel
    //3. https://concorthotel.com/adresine git.
    // 4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
    //a. Username : manager
    //b. Password : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna tıklayın.
    //9. Hotel list linkine tıklayın.
    //10. Istenen hotelin eklendigini dogrulayin..




      @Test
      public void test() throws InterruptedException {

        // Driver.getDriver().get("https://www.concorthotel.com/");
          Driver.getDriver().get(ConfigReader.getProperty("concortHotelUrl"));
          // 4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
          //a. Username : manager
          //b. Password : Manager1!
          //5. Login butonuna tıklayın.
         QAConcortPage qaConcortPage=new QAConcortPage();
         qaConcortPage.ilkLoginLinki.click();
         qaConcortPage.usernameKutusu.sendKeys(ConfigReader.getProperty("correctUser"));
         qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("correctPass"));
         qaConcortPage.loginButonu.click();

         //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
          qaConcortPage.managemntYazısı.click();
          qaConcortPage.hotelListLink.click();
          qaConcortPage.addHotelLink.click();

          //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
          Actions actions=new Actions(Driver.getDriver());
          Faker faker = new Faker();
          actions.click(qaConcortPage.addKutusu).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
          sendKeys(faker.name().name()).sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).
           sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).
           sendKeys(faker.internet().emailAddress()).perform();

          Select select=new Select(qaConcortPage.dropDown);
          select.selectByVisibleText("Hotel Type1");
         // actions.sendKeys(Keys.PAGE_DOWN);
          qaConcortPage.saveButonu.click();

          //9. Hotel list linkine tıklayın.
          qaConcortPage.hotelList.click();
          //10. Istenen hotelin eklendigini dogrulayin..





   }
}

