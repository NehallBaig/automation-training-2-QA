package class25_05StaticClassObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {

    // Class va, Instance variable
    static ChromeDriver driver;

    @Test
   public void iniObject(){
       driver = new ChromeDriver();
   }

    @Test
    public void navigateToGoogle(){
        driver.get("https://www.google.com");
    }

    @Test
    public void verifyURL(){
        Assert.assertEquals(driver.getCurrentUrl(),"");
        System.out.println(driver.getCurrentUrl());
    }
}
