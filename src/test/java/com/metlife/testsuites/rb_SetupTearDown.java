package com.metlife.testsuites;

import com.metlife.utility.rb_WebdriverUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static com.metlife.utility.rb_WebdriverUtility.driver;

public class rb_SetupTearDown {
    @Parameters({"browser"})
    @BeforeClass
    public void LaunchBrowser(String browser){
        rb_WebdriverUtility.initialize(browser);
    }
    @BeforeMethod
    public void LaunchPage(){

        rb_WebdriverUtility.NavigateURL("https://www.redbus.in/");
    }
    @AfterClass
    public void TearDown(){

        driver.quit();
    }
}
