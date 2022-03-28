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
public class open_account extends addCustomer{
    @Test(priority = 2)
    public void OpenAccount() throws NoSuchElementException, InterruptedException {
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





    }

}
