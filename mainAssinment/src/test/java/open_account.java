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
public class open_account  {
    @Test(priority = 2)
    public void OpenAccount() throws NoSuchElementException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepanshusingh8\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      WebElement OpenAccount = driver.findElement(By.xpath("//*[@ng-class='btnClass2']"));
        OpenAccount.click();
       Select uname= new Select(driver.findElement(By.xpath("//*[@name='userSelect']")));
        uname.selectByVisibleText("Harry Potter");
       Select currency = new Select(driver.findElement(By.xpath("//*[@name='currency']")));
       currency.selectByVisibleText("Rupee");
       WebElement Process = driver.findElement(By.xpath("//*[@type='submit']"));
       Process.click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep (3000);
//        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(SrcFile,new File(".//screenshot/openAccount.png"));



    }

}
