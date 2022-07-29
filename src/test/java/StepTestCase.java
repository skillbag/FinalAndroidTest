
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.Keys.ENTER;


public class StepTestCase extends MainTestCase {

    @Test
    public void testFind() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.OpenWiki();
    }

    @Test
    public void testFind1() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.SearchWord();
    }

    @Test
    public void testFind2() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.SearchWiki();
    }

    @Test
    public void testFind3() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.SearchWiki1();
    }

    @Test
    public void testFind4() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.LanguageRu();
    }

    @Test
    public void testFind5() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.OpenClose();
    }

    @Test
    public void testFind6() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.OpenPrivate();
    }

    @Test
    public void testFind7() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.ClickNew();
    }

    @Test
    public void testFind8() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.ClickInsideNew();
    }

    @Test
    public void testFind9() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.NewParol();
    }

    @Test
    public void testFind10() {
        IncTestCase incTestCase = new IncTestCase(driver);
        incTestCase.EditStat();
    }
}
