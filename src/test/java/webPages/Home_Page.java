package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Home page elements
public class Home_Page {

    //Constructor method
    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Sign up button element location
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),' Signup / Login')]")
    public WebElement signUp_Button;

    //Home page button element location
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),' Home')]")
    public WebElement homePage_Button;

    //Logged In tag element location
    @FindBy(xpath = "//a[text()= ' Logged in as ']")
    public WebElement loggedInTag;

    //Logged out button element location
    @FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),' Logout')]")
    public WebElement loggedOutButton;

    //LogIn form Tag element location
    @FindBy(xpath = "//div[@class='login-form']/h2")
    public WebElement loginFormTag;

    //Email input element location
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement logEmail_Input;

    //Password input element location
    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement logPssw_Input;

    //Log In button element location
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement logIn_Button;

    //Delete account button element location
    @FindBy(xpath = "//a[text()= ' Delete Account']")
    public WebElement deleteButton;

    //Delete Tag element location
    @FindBy(xpath = "//h2[@data-qa= 'account-deleted']")
    public WebElement deleteTag;







}
