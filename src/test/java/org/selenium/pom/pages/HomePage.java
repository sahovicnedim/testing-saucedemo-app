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
        load("/"); //pozovemo load metod iz base page
        return this;
    }

    public HomePage enterUsername(String username){
        //kolko sam skonto ovo wait je da se priceka odredjeno vrijeme(nekoliko sekundi) i onda se dalje radi logika
        //explicit wait, posto imamo dvije operacije clear i sendkeys pravimo web element i koristimo ga da izvrsi te operacije
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        e.clear();
        e.sendKeys(username);
        return this;
    }

    public HomePage enterPassword(String password){
        //kolko sam skonto ovo wait je da se priceka odredjeno vrijeme(nekoliko sekundi) i onda se dalje radi logika
        //explicit wait, posto imamo dvije operacije clear i sendkeys pravimo web element i koristimo ga da izvrsi te operacije
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        e.clear();
        e.sendKeys(password);
        return this;
    }
    public Product clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return new Product(driver); //trebamo ovo uradit samo ako navigiramo na novu stranicu, ako cemo ostat na istoj stranici ne moramo ovo uradit, ovo je fluent interface

    }

    public HomePage setLogin(Login login){
        return  enterUsername(login.getUsername()).enterPassword(login.getPassword());
    }


}
