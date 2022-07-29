import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.ENTER;

    public class IncTestCase {

    private AppiumDriver<WebElement> driver;
    public IncTestCase(AppiumDriver<WebElement> driver){
    this.driver = driver;
    }
    public void OpenWiki(){
        driver.findElement(By.className("android.widget.TextView"));
    }
    public void SearchWord(){
        driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
        driver.findElement(By.id("org.wikipedia:id/search_src_text")).sendKeys("wfewfewfwegweg", ENTER);
    }
    public void SearchWiki(){
        driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
        driver.findElement(By.id("org.wikipedia:id/search_src_text")).sendKeys("wikipedia", ENTER);
    }
    public void SearchWiki1(){
        driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
        driver.findElement(By.id("org.wikipedia:id/search_src_text")).sendKeys("википедия", ENTER);
    }
    public void LanguageRu(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Wikipedia language\"]/android.widget.TextView")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[7]")).click();
    }
    public void OpenClose(){
        driver.findElement(By.className("android.widget.TextView"));
        driver.quit();
    }
    public void OpenPrivate() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.className("android.widget.TextView"));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"More options\"]")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("@");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("1");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")).click();
    }
    public void ClickNew(){
        driver.findElement(By.className("android.widget.TextView"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
    }
    public void ClickInsideNew(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
        driver.findElement(By.id("org.wikipedia:id/search_src_text")).sendKeys("Moscow", ENTER);
        driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Russia\"]/android.widget.TextView")).click();
    }
    public void NewParol(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.className("android.widget.TextView"));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"More options\"]")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        driver.findElement(By.id("org.wikipedia:id/login_create_account_link")).click();
    }
    public void EditStat(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
        driver.findElement(By.id("org.wikipedia:id/search_src_text")).sendKeys("Moscow", ENTER);
        driver.findElement(By.id("org.wikipedia:id/fragment_feed_header")).click();
        driver.findElement(By.id("org.wikipedia:id/view_page_header_edit_pencil")).click();
    }
    }
















