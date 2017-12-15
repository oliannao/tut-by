import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordYandexPage extends Page{
    private final String URL = "https://passport.yandex.by/passport?mode=auth&from=mail&retpath=https%3A%2F%2Fmail.yandex.by&origin=hostroot_by_nol_mobile_enter&ncrnd=3351";

    public PasswordYandexPage (WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/div/div/ul/li[1]/div/div[2]/strong")
    private WebElement enter;


    public InboxPage toComeTut() throws InterruptedException {
        Thread.sleep(1000);
        enter.click();
        return new InboxPage(driver);
    }
}
