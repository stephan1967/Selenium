package org.stephan;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    @Test
    public void Test() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.nl");
        driver.quit();
    }
}