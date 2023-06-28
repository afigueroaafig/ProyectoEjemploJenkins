package pages;

import java.time.Duration;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

static{

    //System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 


    //System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\ProyectoEjemploJenkins2\\driver\\chromedriver.exe");
    //System.setProperty("webdriver.chrome.driver","C:\\selenium_webdriver\\chromedriver.exe");
    //System.setProperty("webdriver.chrome.driver","C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\SeleniumGoogle2\\chromedriver.exe");

    //FirefoxOptions fireFoxOptions = new FirefoxOptions();
    //driver = new FirefoxDriver(fireFoxOptions);

    EdgeOptions edgeOptions = new EdgeOptions();
    driver = new EdgeDriver(edgeOptions);

    //ChromeOptions chromeOptions = new ChromeOptions();
    //driver = new ChromeDriver(chromeOptions);

    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

public BasePage(WebDriver driver){
    BasePage.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

public static void navigateTo(String url){
    driver.get(url);
    driver.manage().window().maximize();
    }

public static void closeBrowser(){
    driver.quit();
    }         

private WebElement find(String locator){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

public void clickElement(String locator){
    find(locator).click();
    }      

public void ingresarBusqueda (String locator, String texto){
    find(locator).clear();
    find(locator).sendKeys(texto);
    }  

public void selectFromDropdownByValue(String locator, String valueToSelect){
    Select dropdown = new Select (find(locator));
    dropdown.selectByValue(valueToSelect);
}

public void selectFromDropdownByIndex(String locator, int valueToSelect){
    Select dropdown = new Select (find(locator));
    dropdown.selectByIndex(0);
}

public String textFromElement(String locator){
    return find(locator).getText();
}



}