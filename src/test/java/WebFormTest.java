import pages.PageObjects;
import org.junit.jupiter.api.Test;

public class WebFormTest {
    PageObjects webForm = new PageObjects();

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
}
