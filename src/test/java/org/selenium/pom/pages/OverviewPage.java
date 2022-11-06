package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OverviewPage extends BasePage {

    private final By finishButton = By.cssSelector("#finish");

    public OverviewPage(WebDriver driver) { super(driver); }

    public CheckoutComplete clickFinishButton(){
        wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
        return new CheckoutComplete(driver); //trebamo ovo uradit samo ako navigiramo na novu stranicu, ako cemo ostat na istoj stranici ne moramo ovo uradit, ovo je fluent interface

    }

}
