package com.hrms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

   public void initialization(){
       WebDriverManager.firefoxdriver().setup();
       driver= new FirefoxDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


   }

}
