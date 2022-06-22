package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {
    public TradylinnPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Hesabım']")
    public WebElement hesabımLogınTıkla;
    @FindBy (xpath = "//input[@id='username']")
    public WebElement eMailAdress;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[text()='Giriş Yap']")
    public WebElement girişYapBtn;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;
    @FindBy(xpath = "(//span[@class='text'])[6]")
    public WebElement kuponlar;
    @FindBy(xpath = "//*[text()='Yeni ekle']")
    public WebElement yeniEkle;
    @FindBy (xpath = "//*[text()='Restriction']")
    public WebElement restrictionTıkla;
    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minumumSpend;
    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maxSpend;
    @FindBy (xpath = "//input[@id='individual_use']")
    public WebElement ındividualCheckBox;
    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement excludeCheckBox;
    @FindBy(xpath = "//div[@id='coupons_manage_limit']")
    public WebElement limitUygula;

















}