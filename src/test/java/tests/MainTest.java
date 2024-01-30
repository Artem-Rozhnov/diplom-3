package tests;

import helpers.DriverRule;
import io.qameta.allure.Description;
import org.junit.Rule;
import org.junit.Test;
import pages.MainPage;
import static org.junit.Assert.assertEquals;
public class MainTest {
    @Rule
    public DriverRule driverRule = new DriverRule();

    @Description("Тест проводит проверку перехода к разделу Соусы")
    @Test
    public void testSousesTabs() {
        String expectedTab = "Соусы";
        String basePage = new MainPage(driverRule.getDriver())
                .clickSouses()
                .getCurrentTab();
        assertEquals("Вкладка не переключилась", expectedTab, basePage);

    }

    @Description("Тест проводит проверку перехода к разделу Булки")
    @Test
    public void testBunsTabs() {
        String expectedTab = "Булки";
        String basePage = new MainPage(driverRule.getDriver())
                .clickBuns()
                .getCurrentTab();
        assertEquals("Вкладка не переключилась", expectedTab, basePage);
    }

    @Description("Тест проводит проверку перехода к разделу Начинки")
    @Test
    public void testFillingsTabs() {
        String expectedTab = "Начинки";
        String basePage = new MainPage(driverRule.getDriver())
                .clickFillings()
                .getCurrentTab();
        assertEquals("Вкладка не переключилась", expectedTab, basePage);
    }

}