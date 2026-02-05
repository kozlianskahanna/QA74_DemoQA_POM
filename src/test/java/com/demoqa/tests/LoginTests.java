package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.bookStore.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase {

    @BeforeEach
    public void preconditions() {
        new HomePage(driver).getBookStore();
        new SidePanel(driver).getLogin();
    }

    @Test
    public void loginPositiveTest() {
        new LoginPage(driver).enterUserData("HannaKozlianska", "Anna14031981$")
                .clickOnLoginButton()
                .verifyUserName("HannaKozlianska");
    }
}
