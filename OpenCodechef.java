package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class OpenCodechef
{

        public static void main(String[] args)
        {
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.codechef.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println(driver.getTitle());
            System.out.println(driver.getPageSource());
            System.out.println();
            System.out.println("------LOCATORS-----");
            driver.findElement(By.xpath("//button[@class='m-login-button-no-border']")).click();
            driver.findElement(By.xpath("//div[@class='ccl-su-position-rel']//input[@id='edit-name']")).sendKeys("2100031582@kluniversity.in");
            driver.findElement(By.xpath("//div[@class='ccl-su-position-rel']//input[@id='edit-pass']")).sendKeys("Chukka@2004");
            driver.findElement(By.xpath("//form[@id='ajax-login-form']//input[@id='edit-submit-button']")).submit();

            System.out.println("Alert Message:");
            System.out.print(driver.findElement(By.className("alert")).getText());
        }


}
