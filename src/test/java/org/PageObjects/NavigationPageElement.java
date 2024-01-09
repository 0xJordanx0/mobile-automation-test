package org.PageObjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.Utils.PageFactory;
import org.openqa.selenium.WebElement;

public class NavigationPageElement extends PageFactory {

    public NavigationPageElement(AppiumDriver driver){
        this.driver = driver;
    }

    public WebElement BtnEnterValue(){
        return driver.findElement(AppiumBy.accessibilityId("Btn1"));
    }

}
