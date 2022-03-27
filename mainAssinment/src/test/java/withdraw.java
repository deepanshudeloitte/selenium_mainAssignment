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
public class withdraw {
    @Test(priority = 0)
    public void withdraw() throws NoSuchElementException, InterruptedException {
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
        WebElement withdrawButton = driver.findElement(By.xpath("//*[@ng-class='btnClass3']"));
        withdrawButton.click();
        WebElement AmntToWithdraw= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
        AmntToWithdraw.sendKeys("1000");
        WebElement AmntWithdraw= driver.findElement(By.xpath("//*[@class='btn btn-default']"));
        AmntWithdraw.click();


    }
}
