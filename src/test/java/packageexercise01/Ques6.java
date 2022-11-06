package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques6 {
    WebDriver driver;
@Before
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.agiletestingalliance.org/");
    }
@Test
    public void Test1() throws InterruptedException {

    driver.findElement(By.xpath("//*[@id=\"post-13\"]/div/div/div/div/div/section[7]/div/div/div/div/div/section/div/div/div/div/div/div[2]/div/div/p/a")).click();
  driver.findElement(By.id("wpforms-12490-field_6")).sendKeys("Nancie");driver.findElement(By.id("wpforms-12490-field_6-last")).sendKeys("Malue");
  driver.findElement(By.name("wpforms[fields][7]")).sendKeys("Nancie@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"wpforms-12490-field_8\"]")).sendKeys("0785455444");
    driver.findElement(By.cssSelector("#wpforms-12490-field_9")).sendKeys("NancieM@Datamate.org");
    Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"wpforms-12490-field_10\"]")));
    dropdown1.selectByVisibleText("CP-AAT");
    //Dropdown2
    Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"wpforms-12490-field_11\"]")));
    dropdown2.selectByVisibleText("5-10 Years");
    //Dropdonw3
    Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id=\"wpforms-12490-field_12\"]")));
    dropdown3.selectByVisibleText("Less then 3 years");
    Thread.sleep(5000);
    //checkbox
    WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]"));
    checkbox1.click();
    //submit
    driver.findElement(By.xpath("//*[@id=\"wpforms-submit-12490\"]")).click();

    }
@After
    public void Closebrowser() {

        driver.quit();
    }
}