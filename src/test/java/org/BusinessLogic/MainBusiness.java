package org.BusinessLogic;

import io.appium.java_client.AppiumDriver;
import org.Utils.AllClasses;
import org.Utils.PageFactory;

public class MainBusiness extends PageFactory {

    AllClasses allClasses;
    public MainBusiness(AppiumDriver driver){
        this.driver = driver;
        allClasses = new AllClasses(driver);
    }

    public void EnterSomeTextValue() throws InterruptedException {
        allClasses.getObjNavigationPageElement().BtnEnterValue().click();
        Thread.sleep(3000);
    }
}
