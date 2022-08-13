package org.stephan;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {



    @Test
    void Test1 () {


                ChromeDriver driver = new ChromeDriver();

driver.get ("https://www.google.nl");
driver.quit();

    }

}