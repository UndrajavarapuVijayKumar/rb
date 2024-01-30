package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class rb_resultpage {
    public static By month = By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]");
    public static By click = By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]");
    public static By click2 =By.xpath("//div[starts-with(@class,'DatePicker__CalendarContainer')]//span[text()='4']");
    public static By submit_btn = By.id("search_button");

}
