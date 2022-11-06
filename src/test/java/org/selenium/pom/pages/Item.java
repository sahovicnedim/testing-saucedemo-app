package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Item extends BasePage  {

    private final By addToCartButton = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    private final By backToProduct = By.cssSelector("#back-to-products");
    public Item(WebDriver driver) {
        super(driver);
    }

    public Item clickAddToCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();

        return this;
    }

    public Product clickBackToProduct(){
        wait.until(ExpectedConditions.elementToBeClickable(backToProduct)).click();
        return new Product(driver); //trebamo ovo uradit samo ako navigiramo na novu stranicu, ako cemo ostat na istoj stranici ne moramo ovo uradit, ovo je fluent interface

    }

}
