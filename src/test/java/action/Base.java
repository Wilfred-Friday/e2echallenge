package action;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;


public class Base {
    public WebDriver driver = new ChromeDriver();
    //Method to set up Google Chrome browser with max window
    public void setDriver() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //Method to close the browser
    public  void browserQuit(){
        driver.quit();
    }

    //Method to set up a any url
    public void setUrl(String url) {
        driver.get(url);
    }

    //Method to read a properties file
    public String pRead_Properties_Files(String key){
        String flag = null;
        try{
            Properties prop = new Properties();
            prop.load(new FileInputStream(System.getProperty("user.dir")+"/Global.properties"));
            flag = prop.getProperty(key);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }

    //Method to get the current url as a string
    public String currentUrl(){
        return driver.getCurrentUrl();
    }

    //Method to perform a click action
    public void click(WebElement element){
        element.click();
    }

    //Method to get the text from a web element
    public String elementText(WebElement element){
        return element.getText();
    }

    //Method to send characters
    public void sendKeys(String keys, WebElement element){
        element.sendKeys(keys);
    }

    //Method to select a dropdown option by index
    public void pDropdownHandlerBy_Index(String value, WebElement element){
        Select pDropdown = new Select(element);
        pDropdown.selectByValue(value);
    }

    //Method to close any random iframe that may appear on screen
    public void randomIframeHandler(){
            try {
                // Check if there is an iframe
                List<WebElement> iframes = driver.findElements(By.xpath("//ins[@class='adsbygoogle adsbygoogle-noablate']/div/iframe"));

                for (WebElement iframe : iframes) {
                    Thread.sleep(500);

                    if (iframe.isDisplayed()) {
                        driver.switchTo().frame(iframe);
                        System.out.println("We are on the Iframe");

                        // Check for the close button
                        try {
                            WebElement close_btn = driver.findElement(By.xpath("//div[@id='dismiss-button']"));

                            if (close_btn.isDisplayed()) {
                                close_btn.click();
                                System.out.println("Iframe closed");
                            } else {
                                System.out.println("Close button not found in iframe");
                            }
                        } catch (NoSuchElementException e) {
                            System.out.println("Close button not found in iframe");
                        } finally {
                            driver.switchTo().defaultContent();
                        }
                    } else {
                        System.out.println("Iframe is not displayed");
                    }
                }
            } catch (NoSuchElementException | InterruptedException e) {
                throw new RuntimeException(e);
            }
    }


}
