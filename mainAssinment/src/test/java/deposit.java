import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.xpath;
public class deposit {
    @Test(priority = 3)
    public void deposit() throws NoSuchElementException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepanshusingh8\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement custLogin = driver.findElement(By.xpath("//*[@ng-click='customer()']"));
        custLogin.click();
        Select uname= new Select(driver.findElement(By.xpath("//*[@id='userSelect']")));
        uname.selectByVisibleText("Harry Potter");
        WebElement LoginBiutton = driver.findElement(By.xpath("//*[@type='submit']"));
        LoginBiutton.click();
        WebElement DepositeButton = driver.findElement(By.xpath("//*[@ng-class='btnClass2']"));
        DepositeButton.click();
        WebElement AmntToDepo= driver.findElement(By.xpath("//*[@placeholder='amount']"));
        AmntToDepo.sendKeys("1000");
        WebElement AmntDepo= driver.findElement(By.xpath("//*[@class='btn btn-default']"));
        AmntDepo.click();

        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile,new File(".//screenshot/deposit.png"));

    }
}
