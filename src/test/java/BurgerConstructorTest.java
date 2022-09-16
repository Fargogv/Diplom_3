import org.junit.Test;
import org.junit.Before;
import io.qameta.allure.Epic;
import io.qameta.allure.junit4.DisplayName;
import ru.yandex.praktikum.pom.HomePage;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.*;

@Epic("Navigate burger constructor")
public class BurgerConstructorTest {
    private HomePage homePage;

    @Before
    public void setUp() {
        homePage = open(HomePage.URL, HomePage.class);
    }


    @Test
    @DisplayName("Проверка что есть скролл к элементу конструктора 'Начинки'. Блок 'Начинки' отображается.")
    public void scrollWithFillingElementTest() {

        homePage
                .fillingButtonClick();

        boolean blockVisible = homePage.fillingBlock.isDisplayed();

        assertTrue("Block is invisible", blockVisible);
    }

    @Test
    @DisplayName("Проверка что есть скролл к элементу конструктора 'Булки'. Блок 'Булки' отображается.")
    public void scrollWithBurgerElementTest() {

        homePage
                .fillingButtonClick()
                .bunButtonClick();

        boolean blockVisible = homePage.burgerBlock.isDisplayed();

        assertTrue("Block is invisible", blockVisible);
    }

    @Test
    @DisplayName("Проверка что есть скролл к элементу конструктора 'Соусы'. Блок 'Соусы' отображается.")
    public void scrollWithSauceElementTest() {

        homePage
                .sauceButtonClick();

        boolean blockVisible = homePage.sauceBlock.isDisplayed();

        assertTrue("Block is invisible", blockVisible);
    }
}
