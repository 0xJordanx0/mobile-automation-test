package org.Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;

public class PageFactory {

    public AppiumDriver driver;
    DesiredCapabilities capabilities;
    public void ConfigureAppium(){
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "14");
        capabilities.setCapability("appPackage", "com.code2lead.kwad");
        capabilities.setCapability("appActivity", "com.code2lead.kwad.MainActivity");

        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    public void TearDown(){
        driver.quit();
    }

}
