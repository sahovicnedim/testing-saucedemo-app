package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Cart extends BasePage {

    private final By checkoutButton = By.cssSelector("#checkout");

    public Cart(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage clickCheckoutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
        return new CheckoutPage(driver);

    }


}
