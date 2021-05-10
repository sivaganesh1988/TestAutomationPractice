package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SummaryPage extends PageBase {

    WebDriverWait wait = new WebDriverWait(driver, 30);


    public SummaryPage() {

    }

    public void proceedToCheckout(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='button btn btn-default standard-checkout button-medium']")));
        driver.findElement(By.cssSelector("a[class='button btn btn-default standard-checkout button-medium']")).click();
    }

    public void proceedToShipping(){
      WebElement proceedtoshippingbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("processAddress")));
        proceedtoshippingbutton.click();
    }


    public void assertLoginSectionLoaded() {
        Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
    }

    public void loginToApp(){
        driver.findElement(By.id("email")).sendKeys("sivaganesh.sivakumar@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Newpass123");
        driver.findElement(By.cssSelector("i[class='icon-lock left']")).click();
    }

    public void assertAddressPageLoaded(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("i[class='icon-chevron-right right']")));
        Assert.assertTrue(driver.findElement(By.cssSelector("i[class='icon-chevron-right right']")).isDisplayed());
    }

    public void assertShippingPageLoaded() {
        Assert.assertTrue(driver.findElement(By.name("cgv")).isDisplayed());
    }

    public void agreeToTerms() {
        driver.findElement(By.xpath("//input[@id='cgv']")).click();
    }
}
