package com.google.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchProduct extends PageObject{
	
	public static final Target ADD_BUY_CAR = Target.the("Add to product in buy car ")
            .located(By.xpath("//div[@data-name='PlayStation Consola 4 Pro Stand Alone']//descendant::span[contains(text(), 'Agregar')]//parent::button"));
	
	public static final Target PRODUCT = Target.the("Product in car")
            .located(By.xpath("//div[@class='product-item__info']//a[@title='{0}']"));	
	
	public static final Target VALID_BOTTON = Target.the("Boton  confirm product")
            .located(By.xpath("//div//span[contains(text(),'en el carrito')]"));
	
	public static final Target CAR_BOTTON = Target.the("Botton to car")
            .located(By.xpath("//div//button[@data-minicart]"));
	
	


}
