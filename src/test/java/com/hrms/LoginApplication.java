package com.hrms;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginApplication extends BaseTest{

    @BeforeMethod
    public void setup(){

        initialization();
    }

     @Test
    public void LoginApplication() {


         driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
         driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         String actualPageTitle =driver.getTitle();
         String expectedPageTitle ="OrangeHRM";
         Assert.assertEquals(actualPageTitle, expectedPageTitle);


     }
@AfterMethod
    public void teardown(){
       driver.quit();

}


}
