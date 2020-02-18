package com.google.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchProduct extends PageObject{
	
	public static final Target ADD_BUY_CAR = Target.the("Add to product in buy car ")
            .located(By.xpath("//*[@id=\"ResultItems_20158616\"]/div/ul/li[1]/div[1]/div[3]/div[5]/button/span[5]"));
	
	public static final Target VALID_BOTTON = Target.the("Botton confirm add to car")
            .located(By.xpath("//*[@id=\"ResultItems_20158616\"]/div/ul/li[1]/div[2]"));

}
