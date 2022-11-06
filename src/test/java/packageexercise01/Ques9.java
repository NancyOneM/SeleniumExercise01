package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ques9 {
    WebDriver driver;

@BeforeMethod
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
    }
@Test
    public void Test1() throws InterruptedException {
// printing the content of entire page
    System.out.println(driver.findElement(By.xpath("/html")).getText());
    //System.out.println(driver.getPageSource());
        Thread.sleep(5000);
    }
@AfterMethod
    public void Closebrowser() {

        driver.quit();
    }
}
