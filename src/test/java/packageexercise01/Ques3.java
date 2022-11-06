package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
    WebDriver driver;

    @Before
    public void Setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.datamateinc.com");
    }

    @Test
    public void Test1() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span")).click();
        Thread.sleep(3000);
    }

    @After
    public void Closebrowser(){

        driver.quit();
    }
}
