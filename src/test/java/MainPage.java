import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends Page {
    private final String URL = "https://www.tut.by/";

    public MainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[contains(text(),\"Войти\")]")
    private WebElement enter;

    @FindBy(xpath = "//*[@id=\"authorize\"]/div/div/div/a")
    private WebElement registration;

    @FindBy(xpath = "//input[@name =\"login\"]")
    private WebElement login;

    @FindBy(xpath = "//input[@name =\"password\"]")
    private WebElement password;

    @FindBy(xpath = "/html/body/div[7]/div/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/ul/li[3]/a")
    private WebElement mail;


    private final String log = "rebenokan@tut.by";
    private final String pass = "zxcv2010";

    public void open() {
        getDriver().get(URL);
    }
    public void findEnterClick() {
        enter.click();
    }
    public RegisterPage findRegistration() throws InterruptedException {
        Thread.sleep(1000);
        registration.click();
        return new RegisterPage(driver);
    }
    public void findLogin() throws InterruptedException {
        Thread.sleep(1000);
        login.sendKeys("log");
        password.sendKeys("pass");
    }
    public MailPage findMail() throws InterruptedException {
        Thread.sleep(1000);
        mail.click();
        return new MailPage(driver);
    }
}
