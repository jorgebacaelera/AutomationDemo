package com.test.toolbox.Steps;

import com.test.toolbox.Util.Util;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import java.util.concurrent.TimeUnit;
import com.test.toolbox.Page.ElementsPage;

public class PaySteps extends PageObject {


    ElementsPage elementsPage;


    @Step ("Ingresa a dummy y selecciona Cloudpay del país Argentina ")
    public void openWeb() {
        setDefaultBaseUrl("https://dummy-cert.tbxnet.com/");
        open();
        getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        Serenity.takeScreenshot();
        Util.waitFor(3);
        (getDriver().findElement(By.xpath(elementsPage.buttonRedirect))).click();
        Util.waitFor(3);
        Serenity.takeScreenshot();
        (getDriver().findElement(By.xpath(elementsPage.selectCountryAR))).click();
        Util.waitFor(3);
        Serenity.takeScreenshot();
        (getDriver().findElement(By.xpath(elementsPage.msoModal))).click();
        Util.waitFor(3);
        Serenity.takeScreenshot();
        (getDriver().findElement(By.xpath(elementsPage.msoModalDetails))).click();
        Util.waitFor(3);
        Serenity.takeScreenshot();

    }
    @Step ("Selecciona la opción de Comprar Suscripción")
    public void clickOptionBuy(){
        Serenity.takeScreenshot();
        (getDriver().findElement(By.xpath(elementsPage.buttonBuy))).click();
        Util.waitFor(3);
    }

    @Step ("Cliente ingresa su correo electronico")
    public void insertEmail(String email){
        Serenity.takeScreenshot();
        (getDriver().findElement(By.xpath(elementsPage.textEmail))).sendKeys(email);
        Util.waitFor(1);
    }
    @Step ("Cliente digita su nombre y apellido")
    public void insertPersonalDates(String nombre , String apellido){
        (getDriver().findElement(By.xpath(elementsPage.name))).sendKeys(nombre);
        Util.waitFor(1);
        (getDriver().findElement(By.id(elementsPage.lastname))).sendKeys(apellido);

    }
    @Step ("Cliente acepta los términos y da click en continuar")
    public void clickContinue(){
        (getDriver().findElement(By.id(elementsPage.terms))).click();
        Util.waitFor(1);
        (getDriver().findElement(By.xpath(elementsPage.buttonContinue))).click();
        Util.waitFor(3);
    }


}