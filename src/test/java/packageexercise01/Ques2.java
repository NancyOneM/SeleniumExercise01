package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ques2 {
    WebDriver driver;
    @BeforeMethod
    public void Setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
    }

    @Test
    public void Test1() throws InterruptedException {

        driver.findElement(By.name("search")).sendKeys("Selenium");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
        Thread.sleep(5000);
    }
    @AfterMethod
    public void Closebrowser(){

        driver.quit();
    }
}
