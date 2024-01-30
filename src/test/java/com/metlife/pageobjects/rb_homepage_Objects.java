package com.metlife.pageobjects;

import org.openqa.selenium.By;
        //anything related to By method should be there in pageobjects
public class rb_homepage_Objects {

    public static By from = By.id("src");
    public static  By destination = By.id("dest");
    public static By date_drop = By.className("sc-iwsKbI");
    public static By sindhicamp = By.xpath("//*[contains(text(),'Sindhi Camp')]");
    public static By cmbt = By.xpath("//*[contains(text(),'CMBT, Chennai')]");

}
