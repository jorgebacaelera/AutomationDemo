package com.test.toolbox.StepsDefinitions;

import cucumber.api.java.es.Dado;
import com.test.toolbox.Steps.PaySteps;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class PayStepDefinition {

    @Steps
    PaySteps paySteps;


    @Dado("que el comprador desea ingresar a la plataforma de Cloudpay")
    public void loginBS(){
        paySteps.openWeb();


    }

    @Y("selecciona la opción de comprar Suscripción")
    public void buySuscription(){
        paySteps.clickOptionBuy();
    }

    @Y("ingresa en el formulario sus datos personales (.*) (.*)")
    public void insertNames(String name, String lastname){
        paySteps.insertPersonalDates(name,lastname);
    }

    @Y("ingresa su correo electrónico (.*)")
    public void insertEmail(String email){
        paySteps.insertEmail(email);
    }

    @Y("acepta los terminos y condiciones")
    public void acceptConditions(){
        paySteps.clickContinue();
    }

    @Entonces("debería recibir un mensaje de confirmación al crear la cuenta")
    public void confirmAccount(){

    }


}
