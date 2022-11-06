package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Ques5 {

    WebDriver driver;
    @Before
    public void Setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.datamate.co.za/");

    }
@Test
    public void Test1() throws InterruptedException {

        driver.findElement(By.linkText("Training")).click();
        //Click Selenium
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[3]/div/ul/li[2]/ul/li[8]/a/span/span")).click();
        //Click register
       driver.findElement(By.linkText("REGISTER TODAY")).click();
        // Select from dropdown
      Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/section[3]/div/div[1]/div/div/div/div/form/div[1]/div[9]/div/div[1]/div/div")));
     dropdown.selectByVisibleText("Certified Professional -Selenium Automation Testing- Java  (Practical)");
     //   Thread.sleep(5000);

        System.out.println(driver.getTitle());

    }
@After
    public void Closebrowser(){

        driver.quit();
    }

}
