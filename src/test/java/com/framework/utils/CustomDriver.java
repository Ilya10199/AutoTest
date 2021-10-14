package com.framework.utils;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomDriver implements DriverSource {

    public WebDriver newDriver() {

        return newChromeDriver();
    }

    public boolean takesScreenshots() {

        return false;
    }

    private WebDriver newChromeDriver() {

        ChromeDriverManager.getInstance(ChromeDriver.class).setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        return new ChromeDriver(chromeOptions);
    }
}

