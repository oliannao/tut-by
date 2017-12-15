import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by irct_osadchaya on 15.12.2017.
 */
public class InboxPage extends Page {
    private final String URL = "https://mail.yandex.by/?uid=1130000026157507&login=rebenokan#inbox";
    public InboxPage (WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div[2]/div[2]/div[2]/div[2]/div[1]/a[1]/div/a/span[2]")
    private WebElement username;

    public void findAmount() {
        String s = username.getText();
        System.out.println("Amount of incoming letter is " +s);
    }

}
