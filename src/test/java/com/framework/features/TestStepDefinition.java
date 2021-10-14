package com.framework.features;

import com.framework.steps.ClientSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestStepDefinition {

    @Steps
    ClientSteps client;

    @Given("client opens any {word} site")
    public void clientOpensSite(String url) {
        client.opensSite(url);
    }

    @When("client selects cards in main menu")
    public void clientSelectCardsInMainMenu () {
        client.selectCardsInMainMenu();
    }

    @And("client selects {word} in cards menu")
    public void clientSelectsDebitCardsInCardsMenu(String cardMenuTitle) {
        client.selectsCardInCardMenu(cardMenuTitle);
    }

    @And("client selects {word} card")
    public void clientSelectsCard(String cards) {
        client.selectsCard(cards);
        client.fillsPersonalDate();
    }

}