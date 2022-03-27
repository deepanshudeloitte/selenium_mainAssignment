
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
public class mainAssignment {
    @Test(priority = 0)
    public void login()throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepanshusingh8\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebElement ManagerLogin=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button"));
        ManagerLogin.click();
        WebElement addCustomer=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
        WebElement fname=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
        WebElement lname=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
        WebElement postcode=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
        fname.sendKeys("Prem");
        lname.sendKeys("Artluri");
        //login.click();
        String actualUrl="https://www.saucedemo.com/inventory.html";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        if( driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).isEnabled()){
            Assert.assertTrue(Integer.parseInt(driver.findElement(By.xpath("//*[@id='inventory_container']/div/div[1]/div[2]/div[2]/div/text()[2]") ).getText())<=100);
            driver.findElement(By.xpath("add-to-cart-sauce-labs-fleece-jacket")).click();
        }
    }
}
