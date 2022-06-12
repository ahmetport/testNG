package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    WebDriver driver;

    public AmazonPage() {//pages sayfasında yapacagım ilk şey constructur oluşturmak
        PageFactory.initElements(Driver.getDriver(), this);//drıver clasındaki driveri buraya çagırıyoruz

    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonuçElementi;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonuçYazısıElementi;
    @FindBy(id="searchDropdownBox")
    public WebElement ddp;



    }
