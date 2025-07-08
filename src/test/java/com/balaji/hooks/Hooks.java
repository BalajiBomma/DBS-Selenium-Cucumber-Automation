package com.balaji.hooks;

import com.balaji.utils.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = new ChromeDriver(); // or WebDriverManager.chromedriver().create();
        DriverManager.setDriver(driver);       // ✅ You must call this to avoid null
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
