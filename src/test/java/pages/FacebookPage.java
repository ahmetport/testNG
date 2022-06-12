package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class FacebookPage {
    WebDriver driver;

    public FacebookPage(){
        PageFactory. initElements(Driver.getDriver(),this);
    }

    @FindBy(id="email")
    public WebElement mailKutusu;
    @FindBy(id="pass")
    public WebElement şifreKutusu;
    @FindBy(name="login")
    public WebElement loginKutusu;
    @FindBy(className = "_9ay7")
    public WebElement girilemediYazıElementi;






}
