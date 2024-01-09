package org.Utils;

import io.appium.java_client.AppiumDriver;
import org.PageObjects.NavigationPageElement;

public class AllClasses extends PageFactory{
    NavigationPageElement ObjNavigationPageElement;
    public AllClasses(AppiumDriver driver){
        this.driver = driver;
    }

    public NavigationPageElement getObjNavigationPageElement() {
        return ObjNavigationPageElement = new NavigationPageElement(driver);
    }
}
