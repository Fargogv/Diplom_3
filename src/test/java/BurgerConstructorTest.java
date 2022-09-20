import org.junit.Test;
import org.junit.Before;
import io.qameta.allure.Epic;
import io.qameta.allure.junit4.DisplayName;
import ru.yandex.praktikum.pom.HomePage;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;



@Epic("Navigate burger constructor")
public class BurgerConstructorTest {
    private HomePage homePage;
    private final static String BUNS = "Булки";
    private final static String SAUCES = "Соусы";
    private final static String FILLINGS = "Начинки";

    @Before
    public void setUp() {
        homePage = open(HomePage.URL, HomePage.class);
    }


    @Test
    @DisplayName("Переход к разделу булки")
    public void openBuns() {
        homePage.sauceButtonClick();
        homePage.bunButtonClick();
        homePage.compareText(BUNS);
    }

    @Test
    @DisplayName("Переход к разделу соусы")
    public void openSauces() {
        homePage.sauceButtonClick();
        homePage.compareText(SAUCES);
    }

    @Test
    @DisplayName("Переход к разделу начинки")
    public void openFillings() {
        homePage.fillingButtonClick();
        homePage.compareText(FILLINGS);
    }
}

