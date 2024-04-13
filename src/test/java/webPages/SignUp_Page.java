package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {

    //Constructor method
    public SignUp_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Sign up tag element location
    @FindBy(xpath = "//div[@class='signup-form']/h2")
    public WebElement signUp_Tag;

    //Form banner tag element location
    @FindBy(xpath = "//div[@class='login-form']/h2/b")
    public WebElement pForm_Banner;

    //Name input element location
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement pName_input;

    //Email input element location
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement pEmail_input;

    //SignUp button element location
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement pSubmit_SignUp;

    //Mr round button element location
    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement pMr;

    //Ms round button element location
    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement pMs;

    //Password input element location
    @FindBy(xpath = "//input[@id='password']")
    public WebElement pPassword_input;

    //Calendar days option element location
    @FindBy(xpath = "//select[@id='days']")
    public WebElement pCalendar_Days;

    //Calendar months option element location
    @FindBy(xpath = "//select[@id='months']")
    public WebElement pCalendar_Months;

    //Calendar years option element location
    @FindBy(xpath = "//select[@id='years']")
    public WebElement pCalendar_Years;

    //New letters option element location
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement pNews_Letters_Option;

    //Enroll on offers option element location
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement pEnroll_Offers;

    //First name input element location
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement pFirst_Name;

    //Last name input element location
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement pLast_Name;

    //Company input element location
    @FindBy(xpath = "//input[@id='company']")
    public WebElement pCompany;

    //Address 1 input element location
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement pAddress1;

    //Address 2 input element location
    @FindBy(xpath = "//input[@id='address2']")
    public WebElement pAddress2;

    //Country input element location
    @FindBy(xpath = "//select[@id='country']")
    public WebElement pCountry;

    //State input element location
    @FindBy(xpath = "//input[@id='state']")
    public WebElement pState;

    //City input element location
    @FindBy(xpath = "//input[@id='city']")
    public WebElement pCity;

    //Zip code input element location
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement pZipCode;

    //Mobile phone number input element location
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement pMobile_Number;

    //Create account button element location
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement pCreate_Account_Button;

    //Account created banner element location
    @FindBy(xpath = "//h2[@data-qa='account-created']")
    public WebElement pAccount_Created_Banner;

    //Continue button element location
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement pContinue_Button;




}
