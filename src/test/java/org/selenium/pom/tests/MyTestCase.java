package org.selenium.pom.tests;

import org.junit.jupiter.api.Test;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.objects.Login;
import org.selenium.pom.objects.YourInformation;
import org.selenium.pom.pages.*;
import org.selenium.pom.utils.JacksonUtils;

import java.awt.*;
import java.io.IOException;

public class MyTestCase extends BaseTest {

    @Test
    public void Test() throws IOException {

        Login login = JacksonUtils.deserializeJson("login.json", Login.class);
        Product product = new HomePage(driver).
                load().setLogin(login).clickLoginButton();
        Item item = new Product(driver).clickImage();
        Item item1 = new Item(driver).clickAddToCartButton();
        product = new Item(driver).clickBackToProduct();
        product = new Product(driver).clickAddToCartButton();

        Cart cart = new Product(driver).clickBasketButton();
        CheckoutPage checkoutPage = new Cart(driver).clickCheckoutButton();
        YourInformation yourInformation = JacksonUtils.deserializeJson("yourInformation.json", YourInformation.class);
        OverviewPage overviewPage = new CheckoutInformation(driver).setLoginInformation(yourInformation).clickContinueButton();





    }

}
