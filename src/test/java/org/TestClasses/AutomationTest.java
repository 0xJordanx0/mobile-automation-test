package org.TestClasses;

import org.BusinessLogic.MainBusiness;
import org.Utils.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationTest extends PageFactory {
    MainBusiness ObjMainBusiness;

    @BeforeClass
    public void LaunchMobileApplication(){
        ConfigureAppium();
        ObjMainBusiness = new MainBusiness(driver);
    }

    @Test
    public void TestEnterValue() throws InterruptedException {
        ObjMainBusiness.EnterSomeTextValue();
    }

    @AfterClass
    public void TestTearDown(){
        TearDown();
    }
}
