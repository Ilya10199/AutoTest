package com.framework.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class BasePage extends PageObject {


    public void opensSite(String url) {
        getDriver().get(url);
    }

    public void scrollToElement(WebElementFacade xPath){
            getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView();", xPath);
    }

    public void customClick (WebElementFacade element){
        scrollToElement(element);
        element.click();
    }

    public void customSendKey (WebElementFacade element, String personalInformation){
        scrollToElement(element);
        element.sendKeys(personalInformation);
    }


}
