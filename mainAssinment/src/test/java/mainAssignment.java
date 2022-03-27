
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class mainAssignment {
    @Test(priority = 0)
    public void AddCustomer() throws NoSuchElementException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepanshusingh8\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement ManagerLoginbutton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button"));
        ManagerLoginbutton.click();
        WebElement Addcustomer = driver.findElement(By.xpath("//*[@ng-click='addCust()']"));
        Addcustomer.click();
        WebElement AddcustButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
        WebElement fname = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
       WebElement lname = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
       WebElement postcode = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
      fname.sendKeys("Prem");
      lname.sendKeys("Artluri");
      postcode.sendKeys("abc");
        AddcustButton.click();






    }
}
