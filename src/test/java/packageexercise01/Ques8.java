package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ques8 {

    WebDriver driver;
@BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onlineconversion.com/length_common.htm");

    }
    @Test
    public void Test1() throws InterruptedException {

        driver.findElement(By.name("what")).sendKeys("4");
        Select listbox1 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[1]/select")));
        listbox1.selectByVisibleText("kilometer");
        Select listbox2 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[2]/select")));
        listbox2.selectByVisibleText("meter");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[3]/td/input")).click();
        Thread.sleep(5000);
        //Answer
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[4]/td/input")).getText());
        //Entered number 4
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[1]/td/input")).getText());

    }
@AfterMethod
    public void Closebrowser() {

        driver.quit();
    }
}
