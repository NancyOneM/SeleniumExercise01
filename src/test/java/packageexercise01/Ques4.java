package packageexercise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ques4 {
    WebDriver driver;
@BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    driver.manage().window().maximize();
        driver.get("http://executeautomation.com/demosite/Login.html");

    }
@Test
    public void Test1() throws InterruptedException {

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("UserName")).sendKeys("NancieMM");
        driver.findElement(By.name("Password")).sendKeys("NanieyM@001");
        driver.findElement(By.xpath("//*[@id=\"userName\"]/p[3]/input")).click();
        Thread.sleep(5000);
        Select dropdown = new Select(driver.findElement(By.id("TitleId")));
        dropdown.selectByVisibleText("Ms.");
        driver.findElement(By.id("Initial")).sendKeys("N");
        driver.findElement(By.id("FirstName")).sendKeys("Nancie");
        driver.findElement(By.id("MiddleName")).sendKeys("Amo");
        //Thread.sleep(4000);
        //RadioBox
        WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[5]/td[2]/input[2]"));
        //Radio1.clear();
        Radio1.click();
        Thread.sleep(4000);
        // Checkbox
        WebElement Check1 = driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[6]/td[2]/input[1]"));
        Check1.click();
        WebElement Check2 = driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[6]/td[2]/input[2]"));
        Check2.click();
        Thread.sleep(4000);
        //Save
        driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[7]/td/input")).click();
        //Logout
        driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a/span")).click();
        Thread.sleep(4000);
    }

@AfterMethod
    public void Closebrowser(){

    driver.quit();
    }

}
