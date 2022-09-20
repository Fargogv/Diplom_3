package ru.yandex.praktikum.pom;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.exactText;
public class HomePage {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";
    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    private SelenideElement accountButton;
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement loginButton;
    @FindBy(how = How.XPATH, using = ".//span [@class='text text_type_main-default'][text()='Булки']")
    private SelenideElement bunButton;
    @FindBy(how = How.XPATH, using = ".//span [@class='text text_type_main-default'][text()='Соусы']")
    private SelenideElement sauceButton;
    @FindBy(how = How.XPATH, using = ".//span [@class='text text_type_main-default'][text()='Начинки']")
    private SelenideElement fillingButton;
    @FindBy(how = How.CLASS_NAME, using = "tab_tab_type_current__2BEPc")
    private SelenideElement selectedTab;

    @Step("Click account button")
    public LoginPage clickAccountButton() {
        accountButton.click();
        return page(LoginPage.class);
    }


    @Step("Click bun button")
    public void bunButtonClick() {
        bunButton.click();

    }

    @Step("Click sauce button")
    public void sauceButtonClick() {
        sauceButton.click();
    }

    @Step("Click filling button")
    public void fillingButtonClick() {
        fillingButton.click();
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

    @Step("Compare text with expected")
    public void compareText(String expectedText) {
        selectedTab.shouldHave(exactText(expectedText));
    }
}
