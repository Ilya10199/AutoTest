package com.framework.pages;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

    public void iloyVPopy(String url) {
        getDriver().get(url);
    }

}
