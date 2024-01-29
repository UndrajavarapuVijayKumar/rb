package com.metlife.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.metlife.pageobjects.rb_homepage_Objects.*;
import static com.metlife.utility.rb_WebdriverUtility.*;

public class TS_001 extends rb_SetupTearDown{
    @Test
    public void Booking() throws InterruptedException, IOException {

        type(from,"jaipur (Rajasthan)");
        click(sindhicamp);
        type(destination, "chennai");
        click(cmbt);

        String month=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]")).getText();
        while (!month.contains("Apr 2024"))
        {
            driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
            month=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]")).getText();

        }
        System.out.println(month);
        driver.findElement(By.xpath("//div[starts-with(@class,'DatePicker__CalendarContainer')]//span[text()='4']")).click();
        driver.findElement(By.id("search_button")).click();
        String Error = driver.findElement(By.xpath("//div[@class='oops-wrapper new_oops_wrapper']")).getText();
        assertion(Error,"Oops! No buses found.\n" +
                "Oops! No buses found.");
    }
}
/*
* driver.findElement(By.id("src")).sendKeys("Jaipur");
        driver.findElement(By.className("sc-iwsKbI")).click();
        driver.findElement(By.id("dest")).sendKeys("chennai");
        driver.findElement(By.className("sc-iwsKbI")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dPBSOp")));
        String source = driver.getPageSource();
        FileOutputStream fos = new FileOutputStream("Temp.html");
        fos.write(source.getBytes(StandardCharsets.UTF_8));
        driver.findElement(By.id("Layer_1")).click();

        //For Month Selection:
        String month=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]")).getText();
        while (!month.contains("Apr 2024"))
        {
            driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
            month=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]")).getText();

        }
        System.out.println(month);
        driver.findElement(By.xpath("//div[starts-with(@class,'DatePicker__CalendarContainer')]//span[text()='4']")).click();
        driver.findElement(By.id("search_button")).click();
        String Error = driver.findElement(By.xpath("//div[@class='oops-wrapper new_oops_wrapper']")).getText();
        Assert.assertEquals(Error,"Oops! No buses found.\n" +
                "Oops! No buses found.");*/