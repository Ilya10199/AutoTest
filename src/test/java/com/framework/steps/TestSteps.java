package com.framework.steps;

import com.framework.pages.BasePage;

import com.framework.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TestSteps extends ScenarioSteps {
    MainPage mainPage = new MainPage();
    @Step("ilya vpopy")
    public void ilyaVPopy(String url) {
        pages().get(BasePage.class).iloyVPopy(url);


    }
    @Step("debit card")
    public void debitCard(){
    mainPage.debitCards();
    }






}
