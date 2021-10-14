package com.framework.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ApplicationCard extends BasePage {

    private static final String FIRSTNAME = "Иван";
    private static final String LASTNAME = "Иванов";
    private static final String MIDDLENAME = "Иванович";
    private static final String BIRTHTDATE = "10072004";
    private static final String EMAIL = "ivan@mail.ru";
    private static final String PHONE = "9123456789";
    private static final String PASSPORTSERIES = "1234";
    private static final String PASSPORDNUMBER = "123456";
    private static final String ISSUEDATE = "10072020";


    @FindBy (xpath = "//*[@name ='do-personal__lastName']")
    WebElementFacade lastNameButton;

    @FindBy (xpath = "//*[@id ='do-personal__firstName']")
    WebElementFacade firstNameButton;

    @FindBy (xpath = "//*[@id ='do-personal__middleName']")
    WebElementFacade middleNameButton;

    @FindBy (xpath = "//*[@id ='do-personal__birthDate']")
    WebElementFacade birthDateButton;

    @FindBy (xpath = "//*[@id ='do-personal__email']")
    WebElementFacade emailButton;

    @FindBy (xpath = "//*[@id ='do-personal__phone']")
    WebElementFacade phoneButton;

    @FindBy (xpath = "//*[@id ='do-personal__series']")
    WebElementFacade seriesButton;

    @FindBy (xpath = "//*[@id ='do-personal__number']")
    WebElementFacade numberButton;

    @FindBy (xpath = "//*[@id ='do-personal__issueDate']")
    WebElementFacade issueDateButton;

    @FindBy (xpath = "//*[text()='Далее']")
    WebElementFacade futher;

    public void inputPersonalInformation(){

        customSendKey(lastNameButton, LASTNAME);
        customSendKey(firstNameButton, FIRSTNAME);
        customSendKey(middleNameButton, MIDDLENAME);
        customSendKey(birthDateButton, BIRTHTDATE);
        customSendKey(emailButton, EMAIL);
        customClick(phoneButton);
        customSendKey(phoneButton, PHONE);
        customSendKey(seriesButton, PASSPORTSERIES);
        customSendKey(numberButton, PASSPORDNUMBER);
        customSendKey(issueDateButton, ISSUEDATE);
        customClick(futher);
    }
}
