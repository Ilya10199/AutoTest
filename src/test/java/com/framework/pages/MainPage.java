package com.framework.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {
    public void debitCards()  {
        @FindBy (xpath = "srs")
        $("//p[text()='Дебетовые карты']").click();
        $("//*[contains(text(), 'Особые')]/..//*[@data-test-id='Button-primary-md']").click();
        $("//*[@name='odc-personal__lastName']").sendKeys("Вонючий");
        $("//*[@id='odc-personal__firstName']").sendKeys("Славик");
        $("//*[@id='odc-personal__middleName']").sendKeys("Пенисович");

        $("//*[@id='odc-personal__birthDate']").sendKeys("27071999");
    }

}
