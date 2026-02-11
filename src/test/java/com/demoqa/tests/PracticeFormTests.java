package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.forms.PracticeFormPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PracticeFormTests extends TestBase {

    PracticeFormPage practiceForm;

    @BeforeEach
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).getPracticeForm();
        practiceForm = new PracticeFormPage(driver);
    }

     @Test
    public void createAccountPositiveTest(){
        practiceForm.enterPersonalData("Hanna","Kozlianska","demiyncevaanna@gmail.com","1234567890")
               .selectGender("Male")
                .typeOfData("14 Mar 1981")
                .addSubject(new String[]{"Maths", "English"})
                .selectHobby(new String[]{"Sports", "Music"})
                .uploadFile("/Users/hannakozlianska/Tools/free-png.ru-377 (1).png")
                .enterState("NCR")
                .enterCity("Delhi")
                .submit()
                .verifySuccessRegistration("Thanks for submitting the form")
               ;
               }

    @Test
    public void createAccountNegativeTest(){
        practiceForm.enterPersonalData("Hanna","Kozlianska","demiyncevaanna@gmail.com","123")
                .selectGender("Male")
                .selectDate("August","1981","16")
                .addSubject(new String[]{"Maths", "English"})
                .selectHobby(new String[]{"Sports", "Music"})
                .uploadFile("/Users/hannakozlianska/Tools/free-png.ru-377 (1).png")
                .enterState("NCR")
                .enterCity("Delhi")
                .submit()
                .verifyFormTitle()
        ;
        }
}
