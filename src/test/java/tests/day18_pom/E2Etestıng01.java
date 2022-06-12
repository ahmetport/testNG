package tests.day18_pom;

public class E2Etestıng01 {

   // 1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
    //2. Bir metod olusturun: RoomCreateTest()
    //3. https://www.concorthotel.com/ adresine gidin.
    //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
    // Username : manager b. Password : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
     //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna basin.
     //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
    //10. OK butonuna tıklayın.
    //11. Hotel rooms linkine tıklayın.
    //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
    //11. Hotel list linkine tıklayın.
   //12. Istenen hotelin eklendigini dogrulayin..








































   // @Test
    public void test() throws InterruptedException {
        // 1. Tests packagenin altına class olusturun: D17_CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://qa-environment.concorthotel.com/ adresine git.
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
        //	a. Username : manager
        //	b. Password  : Manager1!
        //5. Login butonuna tıklayın.
        /*

        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        qaConcortPage.hotelManagementLinki.click();
        qaConcortPage.hotelListLink.click();
        qaConcortPage.addHotelLink.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        actions.
                click(qaConcortPage.addHotelCodeKutusu).
                sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).
                perform();
        Select select=new Select(qaConcortPage.addHotelDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("CHQAAddHotelDropdownOption"));

        //8. Save butonuna tıklayın.
        actions.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        qaConcortPage.addHotelSave.click();
        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.

        Thread.sleep(1000);
        System.out.println(qaConcortPage.addHotelSuccesfullYazisi.getText());

        Assert.assertTrue(qaConcortPage.addHotelSuccesfullYazisi.isDisplayed());
        //10. OK butonuna tıklayın.
        qaConcortPage.addHotelAllertOk.click();
        Driver.closeDriver();

         */
    }

}
