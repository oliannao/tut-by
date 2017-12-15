import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 * Created by irct_osadchaya on 15.12.2017.
 */
public class MailPage extends Page {
    private final String URL = "https://profile.tut.by/register.html";

    public MailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id=\"Username\"]")
    private WebElement username;

    @FindBy(xpath = "//input[@id=\"Password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"form\"]/fieldset/div[3]/input")
    private WebElement enter;


    private final String name = "rebenokan@tut.by";
    private final String pass = "zxcv2010";

    public YandexPage findUsername() throws InterruptedException {
        Thread.sleep(1000);
            username.sendKeys(name);
            password.sendKeys(pass);
            enter.click();
        return new YandexPage(driver);
    }
}





