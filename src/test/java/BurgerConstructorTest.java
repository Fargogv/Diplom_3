import org.junit.Test;
import org.junit.Before;
import io.qameta.allure.Epic;
import io.qameta.allure.junit4.DisplayName;
import ru.yandex.praktikum.pom.HomePage;
import static com.codeborne.selenide.Selenide.*;




@Epic("Navigate burger constructor")
public class BurgerConstructorTest {
    private HomePage homePage;
    private final static String BUNS = "Булки";
    private final static String SAUCE = "Соусы";
    private final static String FILLING = "Начинки";

    @Before
    public void setUp() {
        homePage = open(HomePage.URL, HomePage.class);
    }


    @Test
    @DisplayName("Open the buns section")
    public void openBuns() {
        homePage.sauceButtonClick();
        homePage.bunButtonClick();
        homePage.compareText(BUNS);
    }

    @Test
    @DisplayName("Open the sauces section")
    public void openSauces() {
        homePage.sauceButtonClick();
        homePage.compareText(SAUCE);
    }

    @Test
    @DisplayName("Open the filling section")
    public void openFillings() {
        homePage.fillingButtonClick();
        homePage.compareText(FILLING);
    }
}

