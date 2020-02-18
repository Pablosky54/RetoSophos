package com.google.www.task;

import static com.google.www.exceptions.AddProductException.ELEMENT_NO_VISIBLE_FAILED_MESSAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;

import com.google.www.exceptions.AddProductException;
import com.google.www.ui.HomeMetro;
import com.google.www.ui.SearchProduct;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;

public class AddProductToShoppingCart implements Task {

    private String nameProduct;

    public AddProductToShoppingCart(String nameProduct){
        this.nameProduct = nameProduct;
    }


    /*
       Realiza el proceso de:
       1.Buscar producto
       2.selecionarlo
       3.agregar al carrito de compras
    */
    @Override
    @Step("{0} add a product to shopping cart on linio website")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Enter.theValue(nameProduct+"\n").into(HomeMetro.SEARCH_BOX),
            		Click.on(SearchProduct.ADD_BUY_CAR));
            //actor.should(Hit.the(Keys.ENTER));
                    
            /*Click.on(SEARCH_BUTTON),
                    Click.on(PRODUCT_NINTENDO_SWITCH),
                    Click.on(ADD_TO_CART_BUTTON),
                    Click.on(GO_TO_CART_BUTTON));*/
        }catch (ElementNotVisibleException e){
            throw new AddProductException(ELEMENT_NO_VISIBLE_FAILED_MESSAGE,e);
        }
    }

    public static AddProductToShoppingCart withTheName(String nameProduct){
        return instrumented(AddProductToShoppingCart.class,nameProduct);
    }
}
