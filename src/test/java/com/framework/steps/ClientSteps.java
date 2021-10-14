package com.framework.steps;
import com.framework.model.enums.EnumCardMenu;
import com.framework.model.enums.EnumAllCards;
import com.framework.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ClientSteps extends ScenarioSteps {


    @Step("opening site")
    public void opensSite(String url) {
        pages().get(BasePage.class).opensSite(url);
    }

    @Step("selects cards in main menu")
    public void selectCardsInMainMenu() {
        pages().get(MainMenu.class).clientSelectsCardsMenu();
    }

    @Step("selects card in card menu")
    public void selectsCardInCardMenu(String cardMenuTitle) {

        switch (EnumCardMenu.valueOf(cardMenuTitle.toUpperCase())){
            case CREDIT_CARDS:
                pages().get(CardMenu.class).selectsCreditCardsInCardMenu();
                break;
            case DEBIT_CARDS:
                pages().get(CardMenu.class).selectsDebitCardsInCardMenu();
                break;
        }
    }

    @Step("selects card")
    public void selectsCard (String cards){

        switch (EnumAllCards.valueOf(cards.toUpperCase())){

            case YOUNG_CARD:
                pages().get(DebitCards.class).selectsYoungCard();
                break;
            case SBER_CARD:
                pages().get(DebitCards.class).selectsSberCard();
                break;
            case TRAVEL_CARD:
                pages().get(DebitCards.class).selectsTravelCard();
                break;
            case BONUSES_CARD:
                pages().get(CreditCard.class).selectsCardWithBigBonuses();
                break;
            case CREDIT_CARD:
                pages().get(CreditCard.class).selectsNewCreditCard();
                break;
        }
    }
    @Step("client fills in personal date")
    public void fillsPersonalDate(){
        pages().get(ApplicationCard.class).inputPersonalInformation();
    }

}







