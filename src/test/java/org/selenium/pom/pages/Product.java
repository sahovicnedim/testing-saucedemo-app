package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Product extends BasePage {

    private final By image = By.cssSelector("img[alt='Sauce Labs Backpack']");
    private final By addToCartButton = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private final By basket = By.cssSelector(".shopping_cart_link");
    public Product(WebDriver driver) {
        super(driver);
    }

    public Item clickImage(){
        wait.until(ExpectedConditions.elementToBeClickable(image)).click();
        return new Item(driver); //trebamo ovo uradit samo ako navigiramo na novu stranicu, ako cemo ostat na istoj stranici ne moramo ovo uradit, ovo je fluent interface

    }

    public Product clickAddToCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();

        return this;
    }

    public Cart clickBasketButton(){
        wait.until(ExpectedConditions.elementToBeClickable(basket)).click();
        return new Cart(driver); //trebamo ovo uradit samo ako navigiramo na novu stranicu, ako cemo ostat na istoj stranici ne moramo ovo uradit, ovo je fluent interface

    }


}
