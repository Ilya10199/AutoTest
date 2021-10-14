package com.framework.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CreditCard extends BasePage{

    @FindBy (xpath = "//*[text()='Наша новая кредитная карта']")
    WebElementFacade newCreditCardButton;

    @FindBy (xpath = "//*[contains(text(),'большими бонусами')]")
    WebElementFacade cardWithBigBonusesButton;

    public void selectsNewCreditCard() {
        customClick(newCreditCardButton);
    }

    public void selectsCardWithBigBonuses() {
        customClick(cardWithBigBonusesButton);
    }
}
