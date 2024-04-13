package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {
    public SignUp_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='signup-form']/h2")
    public WebElement signUp_Tag;

    @FindBy(xpath = "//div[@class='login-form']/h2/b")
    public WebElement pForm_Banner;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement pName_input;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement pEmail_input;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement pSubmit_SignUp;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement pMr;
    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement pMs;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement pPassword_input;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement pCalendar_Days;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement pCalendar_Months;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement pCalendar_Years;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement pNews_Letters_Option;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement pEnroll_Offers;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement pFirst_Name;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement pLast_Name;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement pCompany;
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement pAddress1;
    @FindBy(xpath = "//input[@id='address2']")
    public WebElement pAddress2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement pCountry;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement pState;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement pCity;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement pZipCode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement pMobile_Number;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement pCreate_Account_Button;

    @FindBy(xpath = "//h2[@data-qa='account-created']")
    public WebElement pAccount_Created_Banner;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement pContinue_Button;




}
