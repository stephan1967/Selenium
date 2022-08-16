package Selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    ChromeDriver driver = new ChromeDriver();

    @Test
    public void Test() {
        vul(driver,"#search_query_top", "CHIFFON");
        klik(driver,".btn.btn-default.button-search");
        klik(driver,"div[id=contact-link] a");
    }

    void vul (ChromeDriver driver, String selector, String text) {
        driver.findElementByCssSelector(selector).sendKeys(text);
    }

    void klik (ChromeDriver driver, String selector) {
        driver.findElementByCssSelector(selector).click();
    }

    @Before
    public void rampUp(){
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}