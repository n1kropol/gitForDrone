//package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by n1kropol on 29.04.2015.
 */
public class TestHelperPassw {
    public static WebDriver driver;

    public static void init() {
//        /usr/local/bin/chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
    }
}
