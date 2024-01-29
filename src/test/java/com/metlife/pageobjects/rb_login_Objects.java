package com.metlife.pageobjects;

import org.openqa.selenium.By;

import static com.metlife.utility.rb_WebdriverUtility.type;

public class rb_login_Objects {

    public static By from = By.id("src");
    public static  By destination = By.id("dest");
    public static By date_drop = By.className("sc-iwsKbI");
    public static By sindhicamp = By.xpath("//*[contains(text(),'Sindhi Camp')]");
    public static By cmbt = By.xpath("//*[contains(text(),'CMBT, Chennai')]");
}
