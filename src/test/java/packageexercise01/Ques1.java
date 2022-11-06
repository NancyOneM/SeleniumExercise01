package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ques1 {
    WebDriver driver;
    String baseurl;

    @BeforeMethod
    public void Setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseurl = "http://www.datamateinc.com";

    }

    @Test
    public void Test1() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.linkText("Training")).click();
        Thread.sleep(5000);

    }
@AfterMethod
    public void Closebrowser() {

        driver.quit();
    }
}



