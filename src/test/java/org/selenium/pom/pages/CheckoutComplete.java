package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CheckoutComplete extends BasePage {

    private final By successNotice = By.cssSelector(".complete-text");


    public CheckoutComplete(WebDriver driver) { super(driver); }

    public String getNotice(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successNotice)).getText();

    }

}
