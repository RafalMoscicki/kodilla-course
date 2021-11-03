package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public final static String XPATH_COOKIE = "//button[contains(@class, \"_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy\")]";
    public final static String XPATH_CREATE_ACCOUNT = "//a[contains(@class, \"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\")]";
    public final static String SELECT_DAY = "//*[@id=\"day\"]";
    public final static String SELECT_MONTH = "//*[@id=\"month\"]";
    public final static String SELECT_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement cookies = driver.findElement(By.xpath(XPATH_COOKIE));
        cookies.click();

        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        createAccount.click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement webDay = driver.findElement(By.xpath(SELECT_DAY));
        Select selectDay = new Select(webDay);
        selectDay.selectByIndex(3);

        WebElement webMonth = driver.findElement(By.xpath(SELECT_MONTH));
        Select selectMonth = new Select(webMonth);
        selectMonth.selectByIndex(3);

        WebElement webYear = driver.findElement(By.xpath(SELECT_YEAR));
        Select selectYear = new Select(webYear);
        selectYear.selectByValue("1991");
    }
}

