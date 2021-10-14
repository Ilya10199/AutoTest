package com.framework.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class MainMenu extends BasePage {

    @FindBy (xpath = "//*[text()='Карты']")
    WebElementFacade cardButton;

    public void clientSelectsCardsMenu(){
        customClick(cardButton);
    }
}
