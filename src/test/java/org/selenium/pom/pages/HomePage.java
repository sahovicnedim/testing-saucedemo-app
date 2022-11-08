package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.Login;

public class HomePage extends BasePage {

    private final By usernameField = By.cssSelector("#user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.cssSelector("#login-button");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load(){
        load("/");
        return this;
    }

    public HomePage enterUsername(String username){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        e.clear();
        e.sendKeys(username);
        return this;
    }

    public HomePage enterPassword(String password){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        e.clear();
        e.sendKeys(password);
        return this;
    }
    public Product clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return new Product(driver);

    }

    public HomePage setLogin(Login login){
        return  enterUsername(login.getUsername()).enterPassword(login.getPassword());
    }


}
