package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TshirtsPage extends PageBase {

    WebDriverWait wait = new WebDriverWait(driver, 30);
    public TshirtsPage() {

    }

    public Boolean assertTshirtsLoaded(){
        try {
            driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]"));
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }

    }

    public void addToCart(){

        Actions actions = new Actions(driver);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,600)");
        

       driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
        WebElement checkoutButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]/span")));
        checkoutButton.click();
    }

    public void assertItemsAdded(){

        WebElement checkoutButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Proceed to checkout']")));
        checkoutButton.click();

    }


}
