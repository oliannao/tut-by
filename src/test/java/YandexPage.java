import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexPage extends Page{
    private final String URL = "https://mail.yandex.by/#inbox";

    public YandexPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/div[1]/div[1]/div[3]/a[2]/span")
    private WebElement enter;


    public PasswordYandexPage toComeYa() throws InterruptedException {
        Thread.sleep(1000);
        enter.click();
        return new PasswordYandexPage(driver);
    }
}
