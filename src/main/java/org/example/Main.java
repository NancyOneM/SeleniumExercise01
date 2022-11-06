package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.datamate.co.za/");


        driver.findElement(By.linkText("Training")).click();
        //Click Selenium
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[3]/div/ul/li[2]/ul/li[8]/a/span/span")).click();
        //Click register
        driver.findElement(By.xpath("//*[@id=\"default-btn-86dfb65d5a95023ba5557de2b61b07ef\"]")).click();
        // Select from dropdown
        Select dropdown = new Select(driver.findElement(By.id("wpforms-3337-field_16")));
        dropdown.selectByVisibleText("Certified Professional -Selenium Automation Testing- Java  (Practical)");


        Thread.sleep(5000);


      //  driver.quit();


       /* driver.get("https://www.wikipedia.org/");
        driver.findElement(By.name("search")).sendKeys("Selenium");
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
        driver.quit();*/

      /*String baseurl = "http://www.datamateinc.com";
        driver.manage().window().maximize();
        driver.get(baseurl);
    Thread.sleep(5000);
        driver.findElement(By.linkText("Training")).click();
       // driver.findElement(By.cssSelector("li.dt-mega-parent:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));
*/
    }
}