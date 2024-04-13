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
    public void setDriver() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public  void browserQuit(){
        driver.quit();
    }

    public void setUrl(String url) {
        driver.get(url);
    }

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
    public String currentUrl(){
        return driver.getCurrentUrl();
    }

    public void click(WebElement element){
        element.click();
    }

    public String elementText(WebElement element){
        return element.getText();
    }

    public void sendKeys(String keys, WebElement element){
        element.sendKeys(keys);
    }

    public void pDropdownHandlerBy_Index(String value, WebElement element){
        Select pDropdown = new Select(element);
        pDropdown.selectByValue(value);
    }

    public void randomIframeHandler(){
        try {
        // Check if there is an iframe
            List <WebElement> iframes = driver.findElements(By.xpath("//ins[@class='adsbygoogle adsbygoogle-noablate']/div/iframe"));
            for (WebElement iframe:iframes) {
                Thread.sleep(500);
                if(iframe.isDisplayed()){
                    driver.switchTo().frame(iframe);
                    System.out.println("We are on the Iframe");
                    // Close the iframe
                    driver.findElement(By.xpath("//div[@class='btn skip']")).click();
                    driver.switchTo().defaultContent();
                    System.out.println("Iframe closed");
                }else{
                    System.out.println("iframe is not displayed");
                }
            }
        } catch (NoSuchElementException | InterruptedException e) {
            throw new RuntimeException(e);
            }
    }


}
