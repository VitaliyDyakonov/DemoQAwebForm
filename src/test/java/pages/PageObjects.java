package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class PageObjects {

    private SelenideElement firstName = $("[id=firstName]");
    private SelenideElement lastName = $("[id=lastName]");
    private SelenideElement email = $("[id=userEmail]");
    private SelenideElement mobile = $("[id=userNumber]");
    private SelenideElement subject = $("[id=subjectsInput]");
    private SelenideElement address = $("[id=currentAddress]");
    private SelenideElement maleButton = $x("//label[@for='gender-radio-1']");
    private SelenideElement femaleButton = $x("//label[@for='gender-radio-2']");
    private SelenideElement otherButton = $x("//label[@for='gender-radio-3']");
    private SelenideElement dateOfBirth = $("#dateOfBirthInput");
    private String dayOfBirth = ".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)";
    private SelenideElement yearOfBirth = $(".react-datepicker__year-select");
    private SelenideElement monthOfBirth = $(".react-datepicker__month-select");
    private SelenideElement sportsRadio = $x("//label[@for='hobbies-checkbox-1']");
    private SelenideElement readingRadio = $x("//label[@for='hobbies-checkbox-2']");
    private SelenideElement musicRadio = $x("//label[@for='hobbies-checkbox-3']");
    private SelenideElement uploadButton = $("[id=uploadPicture]");
    private SelenideElement state = $("#react-select-3-input");
    private SelenideElement city = $("#react-select-4-input");
    private SelenideElement submitButton = $("[id=submit]");
    private String baseURL = "https://demoqa.com/automation-practice-form";

    public void openURL(){
        open(baseURL);
    }
    public void enterFirstName(String fname){
        firstName.sendKeys(fname);
    }
    public void enterLastName(String lname){
        lastName.sendKeys(lname);
    }
    public void enterEmail(String mail){
        email.sendKeys(mail);
    }
    public void enterMobile(String mobileNumber){
        mobile.sendKeys(mobileNumber);
    }
    public void enterSubject(String subj){
        subject.sendKeys(subj);
        subject.pressEnter();
    }
    public void enterAddress(String adres){
        address.sendKeys(adres);
    }
    public void chooseSex(){
        otherButton.click();
        femaleButton.click();
        maleButton.click();
    }
    public void chooseHobbies(){
        sportsRadio.click();
        musicRadio.click();
        readingRadio.click();
    }
    public void enterDateOfBirth(String year, String month, String day){
        dateOfBirth.click();
        yearOfBirth.selectOption(year);
        monthOfBirth.selectOption(month);
        $(String.format(dayOfBirth, day)).click();
    }
    public void uploadPicture(String pictureFile){
        uploadButton.uploadFile(new File(pictureFile));
    }
    public void chooseCountry(String country){
        state.setValue(country);
        state.pressEnter();
    }
    public void chooseCity(String ccity){
        city.setValue(ccity);
        city.pressEnter();
    }
    public void submitForm(){
        submitButton.click();
    }
}
