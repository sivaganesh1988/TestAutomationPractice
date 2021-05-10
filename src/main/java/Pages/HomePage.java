package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public HomePage() {
    }

    public void navigateToHomePage(){
        driver.get("http://automationpractice.com/");
    }


    public void GotoTshirtsPage() {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
        element.click();
    }





}
