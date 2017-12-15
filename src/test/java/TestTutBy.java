import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestTutBy {
    private WebDriver driver;
    private MainPage mainPage;
    private RegisterPage registerPage;
    private MailPage mailPage;
    private YandexPage yandexPage;
    private PasswordYandexPage passwordYandexPage;
    private InboxPage inboxPage;

    @BeforeClass
    public void initBrowes() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void openMainTest() {
        mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.findEnterClick();
          }
    @Test(priority = 2)
    public void findRegistrationTest() throws InterruptedException {
        registerPage = mainPage.findRegistration();

    }
    @Test(priority = 3)
    public void enterDateTest() throws InterruptedException {
        mainPage = registerPage.enterDate();

    }
    @Test(priority = 4)
    public void toComeTest() throws InterruptedException {
        mainPage.open();
        mainPage.findEnterClick();
           }
    @Test(priority = 5)
    public void findLoginTest() throws InterruptedException {
        mainPage.findLogin();
    }
    @Test(priority = 6)
    public void findMailTest() throws InterruptedException {
        mailPage = mainPage.findMail();
    }
    @Test(priority = 7)
    public void findUsernameTest() throws InterruptedException {
        yandexPage = mailPage.findUsername();
    }
    @Test(priority = 8)
    public void toComeYaTest() throws InterruptedException {
        passwordYandexPage = yandexPage.toComeYa();
    }
    @Test(priority = 9)
    public void toComeTutTest() throws InterruptedException {
        inboxPage = passwordYandexPage.toComeTut();
    }
    @Test(priority = 10)
    public void toComeTut() throws InterruptedException {
        inboxPage.findAmount();
    }
}