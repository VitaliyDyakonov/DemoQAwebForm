import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import pages.PageObjects;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class WebFormTest {
    PageObjects webForm = new PageObjects();

    @BeforeAll
    static void setup(){
        Configuration.startMaximized=true;
    }
    @Test
    public void FormFillTest(){
        webForm.openURL();
        webForm.enterFirstName("Vitaliy");
        webForm.enterLastName("Dyakonov");
        webForm.enterEmail("test@gmail.com");
        webForm.enterAddress("Pushkina street 228");
        webForm.enterMobile("+799999999");
        webForm.chooseSex();
        webForm.chooseHobbies();
        webForm.enterSubject("Math");
        webForm.enterSubject("Phys");
        webForm.enterDateOfBirth("1999","April","16");
        webForm.chooseCountry("Haryana");
        webForm.chooseCity("Karnal");
        webForm.uploadPicture("src/test/resources/test.JPG");
        webForm.submitForm();
    }

    /*@Test
    public void WaitTest(){
        webForm.openURL();
        Selenide.$(".css-1uccc91-singleValue").shouldHave(Condition.text("Haryana"), Duration.ofSeconds(30));
    }*/
}
