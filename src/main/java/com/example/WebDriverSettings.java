package com.example;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    protected ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arzuman\\AppData\\Local\\Temp\\Rar$EXa0.138\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @After
    public void close() {
        driver.quit();

    }
}
