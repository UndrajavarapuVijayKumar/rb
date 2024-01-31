package com.metlife.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class rb_WebdriverUtility {
    public static WebDriver driver;
   public static WebDriverWait wait;
        //Anything related to Driver. should be there in this class
    public static void initialize(String browser){
        switch (PropertyUtils.getProperty("browser")){
            case "ff": case "firefox":
                driver = new FirefoxDriver();
                break;
            case "gc": case  "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                driver = new ChromeDriver(options);
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void NavigateURL(String URL){
        driver.get(URL);
    }
    public static void type(By locator, String value){
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        driver.findElement(locator).sendKeys(value);
//        we.clear();

    }
    public static void click(By locator) throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        driver.findElement(locator).click();
        Thread.sleep(3000);
    }
    public static void assertion(String ErrorValue, String ActualValue){
        Assert.assertEquals(ErrorValue,ActualValue);
    }
    public static String gettext(By locator){
        String text= driver.findElement(locator).getText();
        return  text;
    }



}
