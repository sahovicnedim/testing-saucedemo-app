package org.selenium.pom.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait; //varijabla za webdriverwait, mozemo ih vise napravit npr za long i short cekanje

    //konstruktor, u konstruktoru definira wait strategiju
    public BasePage(WebDriver driver){
        this.driver = driver;
        //moze koristit ovaj wait object u pages object klasama
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void load(String endPoint){
        driver.get("https://www.saucedemo.com" + endPoint);
    }

}
