package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.Login;
import org.selenium.pom.objects.YourInformation;

public class CheckoutInformation extends BasePage {

    private final By firstNameField = By.cssSelector("#first-name");
    private final By lastNameField = By.cssSelector("#last-name");
    private final By zipCodeField = By.cssSelector("#postal-code");

    private final By continueButton = By.id("continue");


    public CheckoutInformation(WebDriver driver) {
        super(driver);
    }

    public CheckoutInformation enterFirstName(String firstName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    public CheckoutInformation enterLastName(String lastName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    public CheckoutInformation enterZipCode(String zipCode){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(zipCodeField));
        e.clear();
        e.sendKeys(zipCode);
        return this;
    }


    public OverviewPage clickContinueButton(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        return new OverviewPage(driver); //trebamo ovo uradit samo ako navigiramo na novu stranicu, ako cemo ostat na istoj stranici ne moramo ovo uradit, ovo je fluent interface

    }

    public CheckoutInformation setLoginInformation(YourInformation yourInformation){
        return  enterFirstName(yourInformation.getFirstName()).enterLastName(yourInformation.getLastName()).enterZipCode(yourInformation.getZipCode());
    }

}
