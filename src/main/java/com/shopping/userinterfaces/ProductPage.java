package com.shopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject {
    public static Target TITLE_PRODUCT=Target.the("Titulo del producto seleccionado").locatedBy("//a[text()='{0}']");
}
