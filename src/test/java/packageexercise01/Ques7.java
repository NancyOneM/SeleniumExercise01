package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques7 {
    WebDriver driver;
@Before
    public void Setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
}
@Test
    public void Test1() throws InterruptedException {

    System.out.println(driver.getTitle());

    driver.findElement(By.name("q")).sendKeys("Yahoo");
   driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/table/tbody/tr[1]/td/div/h3/a")).click();
        Thread.sleep(5000);
    }
@After
    public void Closebrowser(){

        driver.quit();
    }
}