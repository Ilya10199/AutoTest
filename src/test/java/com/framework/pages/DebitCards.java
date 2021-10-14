package com.framework.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class DebitCards extends BasePage {

    @FindBy(xpath = "//*[text()='Молодёжная СберКарта']")
    WebElementFacade youngCardButton;

    @FindBy(xpath = "//*[text()='СберКарта']")
    WebElementFacade sberCardButoon;

    @FindBy(xpath = "//*[text()='СберКарта Тревел']")
    WebElementFacade travelCardButoon;



    public void selectsYoungCard() { customClick(youngCardButton); }

    public void selectsSberCard() {
        customClick(sberCardButoon);
    }

    public void selectsTravelCard(){
        customClick(travelCardButoon);
    }
}
