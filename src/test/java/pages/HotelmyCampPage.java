package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelmyCampPage {

    public HotelmyCampPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id="navLogon")
    public WebElement logınTuşu;
    @FindBy(id="UserName")
    public WebElement isimKutusu;
    @FindBy(id="Password")
    public WebElement şifreKutusu;
    @FindBy(id="btnSubmit")
    public WebElement logınTuşunaBas;
    @FindBy(id="divMessageResult")
    public WebElement girilemediYazısı;
    @FindBy(xpath = "//li[@class='dropdown dropdown-user']")
    public WebElement managerPozitif;


}
