package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {

    public static final String FACEBOOK_PAGE = "https://www.facebook.com/";
    public static final String XPATH_COOKIES = "//button [@data-cookiebanner=\"accept_button\"]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div [@class=\"_6ltg\"]/a";
    public static final String XPATH_SELECT_DAY = "//select [@name=\"birthday_day\"]";
    public static final String XPATH_SELECT_MONTH = "//select [@name=\"birthday_month\"]";
    public static final String XPATH_SELECT_YEAR = "//select [@name=\"birthday_year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(FACEBOOK_PAGE);
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT)).click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
        }

        WebElement selectFileDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectFileDay);
        selectDay.selectByIndex(20);

        WebElement selectFileMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectFileMonth);
        selectMonth.selectByIndex(10);

        WebElement selectFileYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectFileYear);
        selectYear.selectByIndex(37);
    }
}