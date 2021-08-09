package com.framework.features;

import com.framework.steps.TestSteps;
import io.cucumber.java.en.Given;

import net.thucydides.core.annotations.Steps;

public class TestStepDefinition {

    @Steps
    TestSteps testSteps;

    @Given("user opens {word}")
    public void userOpen(String url){
    testSteps.ilyaVPopy(url);

    }

    @Given("user selects")
    public void selectDebitCard(){
    testSteps.debitCard();
    }




}





