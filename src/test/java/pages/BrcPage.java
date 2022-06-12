package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@role='button']")
    public WebElement ilkLoginButonu;
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailTextBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButtonu;
    @FindBy(id="dropdown-basic-button")
    public WebElement kullanıcıProfilİsmi;
    @FindBy(xpath = "//div[@class='dropdown']")
    public WebElement profilİsmi;
    @FindBy(xpath = "(//*[@class='nav-link'])[4]")
    public WebElement contact;
    @FindBy(xpath = "//div[text()='Call Center']")
    public WebElement callCenter;
    @FindBy(xpath = "(//div[@class='card-body'])[1]")
    public WebElement yazıElementi;
}
