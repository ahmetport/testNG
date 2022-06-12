package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QAConcortPage {

  public   QAConcortPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(id="UserName")
    public WebElement usernameKutusu;

    @FindBy(id="Password")
    public WebElement passwordKutusu;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy (xpath = "//*[.='Try again please']")
    public WebElement loginFailedYazisi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement managemntYazısı;

   @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListLink;

   @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelLink;
   @FindBy(xpath = "//input[@id='Code']")
    public WebElement addKutusu;
   @FindBy(id="IDGroup")
    public WebElement dropDown;

   @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButonu;
   @FindBy(xpath = "//a[@href=\"/admin/HotelAdmin\"]")
    public WebElement hotelList;



}



