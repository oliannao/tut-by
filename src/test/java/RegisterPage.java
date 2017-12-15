import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page{
    private final String URL = "https://profile.tut.by/register.html";
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id=\"field-email\"]")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@id=\"field-password\"]")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@id=\"field-fio\"]")
    private WebElement fieldFio;

    @FindBy(xpath = "//input[@id=\"field-birthday\"]")
    private WebElement fieldBirthday;

    @FindBy(xpath = "//label[contains(.,\"Я женщина\")]")
    private WebElement shooseSex;

    @FindBy(xpath = "//input[@id=\"field-city\"]")
    private WebElement fieldCity;

    @FindBy(xpath = "//input[@id=\"field-phone\"]")
    private WebElement fieldPhone;

    @FindBy(xpath = "//button[@id=\"reg_submit\"]")
    private WebElement reg_submit;

    private final String email = "rebenokan";
    private final String password = "rebenokan1111";
    private final String fio = "Hanna Asadshaya";
    private final String birthday = "11.07.80";
    private final String city = "Минск";
    private final String phone = "291193591";

    public MainPage enterDate () throws InterruptedException {
        Thread.sleep(6000);
        fieldEmail.sendKeys(email);
        fieldPassword.sendKeys(password);
        fieldFio.sendKeys(fio);
        fieldBirthday.sendKeys(birthday);
        shooseSex.click();
        fieldCity.sendKeys(city);
        fieldPhone.sendKeys(phone);
        reg_submit.click();
        return new MainPage(driver);
}
}
