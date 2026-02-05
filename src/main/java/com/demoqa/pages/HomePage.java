package com.demoqa.pages;

import com.demoqa.core.BasePage;
import com.demoqa.pages.alertsFrameWindows.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".card:nth-child(6)")
    WebElement bookStore;
    @FindBy(css = ".card:nth-child(3)")
    WebElement alertsFrameWindows;
    @FindBy(css = ".card:nth-child(4)")
    WebElement widgets;
    @FindBy(css = ".card:nth-child(5)")
    WebElement interaction;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SidePanel getBookStore() {
        clickWithJS(bookStore,0,600);
        return new SidePanel(driver);
    }

    public SidePanel getAlertsFrameWindows() {
        clickWithJS(alertsFrameWindows,0,300);
        return new SidePanel(driver);
    }

    public SidePanel getWidgets() {
        clickWithJS(widgets,0,300);
        return new SidePanel(driver);
    }

    public SidePanel getInteractions() {
        clickWithJS(interaction,0,300);
        return new SidePanel(driver);
    }
}
