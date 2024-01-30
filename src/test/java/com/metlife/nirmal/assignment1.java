package com.metlife.nirmal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

public class assignment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mockexam2cpsat.agiletestingalliance.org/");
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        WebElement element = driver.findElement(By.xpath("//h2[text()='Follow Us']"));
        js.executeScript("arguments[0].scrollIntoView();",element);
        List<WebElement> l1 = driver.findElement(By.xpath("//div[@class='elementor-social-icons-wrapper elementor-grid']")).findElements(By.tagName("a"));
        System.out.println(l1.size());
        for(WebElement soc:l1){
            System.out.println(soc.getAttribute("href"));
        }
        WebElement element2 = driver.findElement(By.xpath("(//div[@class='elementor-widget-container'])[4]"));
        js.executeScript("arguments[0].scrollIntoView();",element2);
        List <WebElement> l2 =  driver.findElements(By.xpath("(//div[@class='elementor-countdown-item'])"));
        for(WebElement num : l2){
            System.out.println(num.getText());
        }
    }
}
