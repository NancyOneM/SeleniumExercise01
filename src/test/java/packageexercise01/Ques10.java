package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques10 {
    WebDriver driver;

    @Before
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

    }
@Test
    public void Test1() throws InterruptedException {

        driver.findElement(By.name("search")).sendKeys("Black Panther (film)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();

        //Verify that the budget was $200–210 million
    System.out.println("Budget: ");
    System.out.println(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[17]/td")).getText());
    System.out.println("===============================================");

    //Display names of starring in the console
    System.out.println("Names of starring : ");
    System.out.println(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[7]/td")).getText());
    System.out.println("===============================================");

    //Verify that the director is Ryan Coogler
    System.out.println("Director Name: ");
    System.out.println(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[3]/td/a")).getText());
    System.out.println("===============================================");

    // Display the current url
    System.out.println("URL: ");
    System.out.println(driver.getCurrentUrl());

    }
@After
    public void Closebrowser(){

        driver.quit();
    }
}
