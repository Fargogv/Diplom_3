package ru.yandex.praktikum.pom;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";
    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    private SelenideElement accountButton;
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement loginButton;
    @FindBy (how = How.XPATH, using = ".//div/ul[1]")
    public SelenideElement burgerBlock;
    @FindBy (how = How.XPATH, using = ".//div/ul[2]")
    public SelenideElement sauceBlock;
    @FindBy (how = How.XPATH, using = ".//div/ul[3]")
    public SelenideElement fillingBlock;
    @FindBy (how = How.XPATH, using = ".//span [@class='text text_type_main-default'][text()='Булки']")
    private SelenideElement bunButton;
    @FindBy (how = How.XPATH, using = ".//span [@class='text text_type_main-default'][text()='Соусы']")
    private SelenideElement sauceButton;
    @FindBy (how = How.XPATH, using = ".//span [@class='text text_type_main-default'][text()='Начинки']")
    private SelenideElement fillingButton;
    @Step("Click account button")
    public LoginPage clickAccountButton() {
        accountButton.click();
        return page(LoginPage.class);
    }


    @Step ("Click bun button")
    public HomePage bunButtonClick(){
        bunButton.click();
        return this;
    }

    @Step ("Click sauce button")
    public HomePage sauceButtonClick(){
        sauceButton.click();
        return this;
    }

    @Step ("Click filling button")
    public HomePage fillingButtonClick(){
        fillingButton.click();
        return this;
    }
    @Step("Click account button, go account page")
    public AccountPage clickAccountButtonGoAccountPage() {
        accountButton.click();
        return page(AccountPage.class);
    }

    @Step("Click login button")
    public LoginPage clickLoginButton() {
        loginButton.click();
        return page(LoginPage.class);
    }
}
