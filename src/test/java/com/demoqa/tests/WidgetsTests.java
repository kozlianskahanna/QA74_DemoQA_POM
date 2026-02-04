package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.core.widgets.SelectPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WidgetsTests extends TestBase {

    SidePanel sidePanel;
    SelectPage select;

    @BeforeEach
    public void precondition(){
        sidePanel = new SidePanel(driver);
        select = new SelectPage(driver);
        new HomePage(driver).getWidgets();
    }

    @Test
    public void oldStyleSelectMenuTest(){
        sidePanel.getSelectMenu();
        select.oldStyleSelect("Yellow")
                .verifyColor();
    }

    @Test
    public void multiSelectTest(){
        sidePanel.getSelectMenu();
        select.multiSelect(new String[]{"Green","Red"})
                .verifyMultiSeleckt(new String[]{"Green","Red"});
    }

    @Test
    public void standardMultiSelectTest() {
        sidePanel.getSelectMenu();
        select.verifySelectedCar("opel","rgba(179, 215, 255, 1)");
    }
}
