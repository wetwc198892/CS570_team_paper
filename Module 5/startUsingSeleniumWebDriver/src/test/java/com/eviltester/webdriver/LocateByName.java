import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class LocateByName{

     @Test
     public void startWebDriver(){
          WebDriver driver = new ChromeDriver();//Initialize driver

          driver.navigate().to("https://testpages.herokuapp.com/styled/basic-html-form-test.html");//set up the website address

          WebElement UserName = driver.findElement(By.name("username"));//get the username text box
          WebElement PassWord = driver.findElement(By.name("password"));//get the password text box
          WebElement Comments = driver.findElement(By.name("comments"));//get the comments text box

          UserName.sendKeys("User01");//set up the text box content
          PassWord.sendKeys("CS570password!");//set up the text box content
          Comments.sendKeys("Welcome to Software Testing");//set up the text box content

          // WebElement Submit = driver.findElement(By.name("submitbutton"));
          // Submit.click();

          Select DropDown = new Select(driver.findElement(By.name("dropdown")));//get the Drop Down value
          DropDown.selectByVisibleText("Drop Down Item 6");//select the item 6
          driver.close();//when the testing is done, close the chrome
          driver.quit();
     }
}