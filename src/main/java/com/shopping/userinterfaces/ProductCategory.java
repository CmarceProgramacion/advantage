package com.shopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductCategory extends PageObject {

    public static Target LABEL_TITLE_PRODUCT=Target.the("Titulo de la pagina del producto").locatedBy("//span[text()='dvantage']");
    public static Target IMAGE_CATEGORY_PRODUCT =Target.the("Imagen de categoria del producto").locatedBy("//div[contains(@id,'laptops')]");

    public static Target LIST_NAME_PRODUCTS=Target.the("Lista de nombres de los productos").locatedBy("//a[@class='productName ng-binding']");


}
