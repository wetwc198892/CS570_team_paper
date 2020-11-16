import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


public class MouseAndKeyboard {

    @Test
    public void startWebDriver(){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        WebElement OnClickButton = driver.findElement(By.id("onclick"));
        WebElement RightClick = driver.findElement(By.id("oncontextmenu"));
        WebElement OnDoubleClick = driver.findElement(By.id("ondoubleclick"));
        WebElement OnKeyPress = driver.findElement(By.id("onkeypress"));

        Actions builder = new Actions(driver);
        
        Action seriesOfActions = builder.moveToElement(OnClickButton).click().moveToElement(OnDoubleClick).doubleClick().moveToElement(RightClick).contextClick().sendKeys(OnKeyPress,"a").build();

        seriesOfActions.perform();
    
    }
}