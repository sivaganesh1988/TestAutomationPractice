package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase extends WebDriverBase {

    public PageBase(){
        PageFactory.initElements(getDriverInstance(),this);
    }
}
