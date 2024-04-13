package step_Definition;

import action.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webPages.Home_Page;
import webPages.SignUp_Page;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class E2E_001 extends Base {

    Home_Page homePage = new Home_Page(driver);
    SignUp_Page signUpPage = new SignUp_Page(driver);

    @Before //set browser reading the properties files
    public void pSetBrowser(){
        setDriver();
        setUrl(pRead_Properties_Files("url"));
    }
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        click(homePage.homePage_Button);
        assertEquals(pRead_Properties_Files("url"),currentUrl());
        System.out.println("User is on the Home Page");
    }
    @When("the user navigates to the signup page")
    public void the_user_navigates_to_the_signup_page() {
        click(homePage.signUp_Button);
    }

    @Then("the user should see the {string} message")
    public void the_user_should_see_the_message(String signUpTag) {
        assertTrue("SignUp message is not visible", signUpPage.signUp_Tag.isDisplayed());
        assertEquals(signUpTag,elementText(signUpPage.signUp_Tag));
        System.out.println("Sign Up message is displayed");
    }

    @When("the user fills in the signup form with {string}, {string}")
    public void the_user_fills_in_the_signup_form_with(String name, String email) {
        sendKeys(name,signUpPage.pName_input);
        sendKeys(email,signUpPage.pEmail_input);
    }

    @And("the user submits the signup form")
    public void the_user_submits_the_signup_form() {
        click(signUpPage.pSubmit_SignUp);
    }
    @Then("the user should see the tag {string} message")
    public void the_user_should_see_the_tag_message(String signUpForm) {
        assertTrue("SignUp tag message is not visible", signUpPage.pForm_Banner.isDisplayed());
        assertEquals(signUpForm,elementText(signUpPage.pForm_Banner));
        System.out.println("SignUp tag message is displayed");
    }

    @When("the user completes the account information form with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_completes_the_account_information_form_with(String password, String date, String month, String year, String firstname, String lastname, String company, String address1, String address2, String country, String state, String city, String zipcode, String mobilephone) {
        click(signUpPage.pMr);
        sendKeys(password,signUpPage.pPassword_input);
        pDropdownHandlerBy_Index(date, signUpPage.pCalendar_Days);
        pDropdownHandlerBy_Index(month, signUpPage.pCalendar_Months);
        pDropdownHandlerBy_Index(year, signUpPage.pCalendar_Years);
        click(signUpPage.pNews_Letters_Option);
        click(signUpPage.pEnroll_Offers);
        sendKeys(firstname, signUpPage.pFirst_Name);
        sendKeys(lastname, signUpPage.pLast_Name);
        sendKeys(company, signUpPage.pCompany);
        sendKeys(address1, signUpPage.pAddress1);
        sendKeys(address2, signUpPage.pAddress2);
        sendKeys(country, signUpPage.pCountry);
        sendKeys(state, signUpPage.pState);
        sendKeys(city, signUpPage.pCity);
        sendKeys(zipcode, signUpPage.pZipCode);
        sendKeys(mobilephone, signUpPage.pMobile_Number);
    }

    @And("the user submits the account information form")
    public void the_user_submits_the_account_information_form() {
       click(signUpPage.pCreate_Account_Button);
    }

    @Then("the user should see the a new tag {string} message")
    public void the_user_should_see_the_a_new_tag_message(String accountCreatTag) {
        assertTrue("Create Account tag message is not visible", signUpPage.pAccount_Created_Banner.isDisplayed());
        assertEquals(accountCreatTag,elementText(signUpPage.pAccount_Created_Banner));
        System.out.println("Account created tag message is displayed");
        click(signUpPage.pContinue_Button);
        randomIframeHandler();
    }

    @When("the user continues should see the tag {string} message")
    public void the_user_continues_should_see_the_tag_message(String loggedInTag){
        assertTrue("LoggedIn tag message is not visible", homePage.loggedInTag.isDisplayed());
        assertEquals(loggedInTag,elementText(homePage.loggedInTag));
        System.out.println("LoggedIn tag message is displayed");
    }

    @And("the user logs out from the account")
    public void the_user_logs_out_from_the_account() {
        click(homePage.loggedOutButton);

    }

    @Then ("the user loggedOut should see a {string} message")
    public void the_user_loggedOut_should_see_a_message(String LoggTag){
        assertTrue("LoggedIn tag message is not visible", homePage.loginFormTag.isDisplayed());
        assertEquals(LoggTag,elementText(homePage.loginFormTag));
        System.out.println("LoggedIn form tag message is displayed");
    }

    @When("the user logs back in with valid credentials {string}, {string}")
    public void the_user_logs_back_in_with_valid_credentials(String email, String password) {
        sendKeys(email, homePage.logEmail_Input);
        sendKeys(password, homePage.logPssw_Input);
        click(homePage.logIn_Button);
    }

    @Then("the user should see again the {string} message")
    public void the_user_should_see_again_the_message(String logInTag){
        assertTrue("LoggedIn tag message is not visible", homePage.loggedInTag.isDisplayed());
        assertEquals(logInTag,elementText(homePage.loggedInTag));
        System.out.println("LoggedIn tag message is displayed");
    }

    @When("the user deletes the account")
    public void the_user_deletes_the_account() {
        click(homePage.deleteButton);
    }

    @Then("the user should see the text {string} message")
    public void the_user_should_see_the_text_message(String deleted){
        assertTrue("Deleted account tag message is not visible", homePage.deleteTag.isDisplayed());
        assertEquals(deleted,elementText(homePage.deleteTag));
        System.out.println("Deleted tag message is displayed");
    }

    @After //Close the browser after test is completed
    public void pQuit(){
       browserQuit();
    }


}
