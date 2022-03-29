import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public  class allScenerio{
    public  static WebDriver driver;
    @Test(priority = 1)
    public void allscenerio() throws NoSuchElementException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepanshusingh8\\Downloads\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         //****** add customer and login ************//

        WebElement ManagerLoginbutton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button"));
        ManagerLoginbutton.click();
        WebElement Addcustomer = driver.findElement(By.xpath("//*[@ng-click='addCust()']"));
        Addcustomer.click();
        WebElement AddcustButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
        WebElement fname = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
        WebElement lname = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
        WebElement postcode = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
        fname.sendKeys("Prem");
        lname.sendKeys("Atluri");
        postcode.sendKeys("123456");
        AddcustButton.click();
        driver.switchTo().alert().accept();

        //****** open account  and login ************//
        WebElement OpenAccount = driver.findElement(By.xpath("//*[@ng-class='btnClass2']"));
        OpenAccount.click();

        Select uname= new Select(driver.findElement(By.xpath("//*[@name='userSelect']")));
        uname.selectByVisibleText("Harry Potter");
        Select currency = new Select(driver.findElement(By.xpath("//*[@name='currency']")));
        currency.selectByVisibleText("Rupee");
        WebElement Process = driver.findElement(By.xpath("//*[@type='submit']"));
        Process.click();
        driver.switchTo().alert().accept();

        WebElement home= driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]"));
        home.click();

        //****** deposit money  for the user ************//

        WebElement custLogin = driver.findElement(By.xpath("//*[@ng-click='customer()']"));
        custLogin.click();
        Select uname1= new Select(driver.findElement(By.xpath("//*[@id='userSelect']")));
        uname1.selectByVisibleText("Harry Potter");
        WebElement LoginBiutton = driver.findElement(By.xpath("//*[@type='submit']"));
        LoginBiutton.click();
        WebElement DepositeButton = driver.findElement(By.xpath("//*[@ng-class='btnClass2']"));
        DepositeButton.click();
        WebElement AmntToDepo= driver.findElement(By.xpath("//*[@placeholder='amount']"));
        AmntToDepo.sendKeys("1000");
        WebElement AmntDepo= driver.findElement(By.xpath("//*[@class='btn btn-default']"));
        AmntDepo.click();
        //****** taking the screen shot for the deposit money ************//
        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile,new File(".//screenshot/depositmain.png"));

        WebElement home2= driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]"));
        home2.click();


             //*********withdraw the amount******//
        WebElement custLogin1 = driver.findElement(By.xpath("//*[@ng-click='customer()']"));
        custLogin1.click();
        Select uname3= new Select(driver.findElement(By.xpath("//*[@id='userSelect']")));
        uname3.selectByVisibleText("Harry Potter");
        WebElement LoginBiutton3 = driver.findElement(By.xpath("//*[@type='submit']"));
        LoginBiutton3.click();
        WebElement withdrawButton = driver.findElement(By.xpath("//*[@ng-class='btnClass3']"));
        withdrawButton.click();
        WebElement AmntToWithdraw= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
        AmntToWithdraw.sendKeys("1000");
        WebElement AmntWithdraw= driver.findElement(By.xpath("//*[@class='btn btn-default']"));
        AmntWithdraw.click();
        //****** taking the screen shot for the withdraw money ************//
        File SrcFile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile2,new File(".//screenshot/withdrawmain.png"));

    }

        }