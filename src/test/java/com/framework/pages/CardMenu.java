package com.framework.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CardMenu extends BasePage{

    @FindBy (xpath = "//*[text()='Карты']/../../../../..//*[text()='Дебетовые карты']")
    WebElementFacade debitCardButton;

    @FindBy (xpath = "//*[text()='Карты']/..//*[text()='Кредитные карты']")
    WebElementFacade creditCardButton;

    public void selectsDebitCardsInCardMenu() {
        customClick(debitCardButton);

    }

    public void selectsCreditCardsInCardMenu() {
        customClick(creditCardButton);
    }

}
