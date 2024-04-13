package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),' Signup / Login')]")
    public WebElement signUp_Button;

    @FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),' Home')]")
    public WebElement homePage_Button;


    @FindBy(xpath = "//a[text()= ' Logged in as ']")
    public WebElement loggedInTag;

    @FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),' Logout')]")
    public WebElement loggedOutButton;

    @FindBy(xpath = "//div[@class='login-form']/h2")
    public WebElement loginFormTag;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement logEmail_Input;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement logPssw_Input;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement logIn_Button;

    @FindBy(xpath = "//a[text()= ' Delete Account']")
    public WebElement deleteButton;

    @FindBy(xpath = "//h2[@data-qa= 'account-deleted']")
    public WebElement deleteTag;







}
