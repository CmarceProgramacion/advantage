package com.shopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject {
    public static Target TITLE_PRODUCT = Target.the("Titulo del producto seleccionado").locatedBy("//a[text()='{0}']");
    public static Target BUTTON_SAVE_PRODUCT = Target.the("Boton para guardar el producto").locatedBy("//button[@name='save_to_cart']");
    public static Target BUTTON_SHOPPING_CART = Target.the("Boton del carrito").locatedBy("//a[@id='shoppingCartLink']");
    public static Target BUTTON_CHECKOUT_PURCHASE = Target.the("Boton del verificacion de compra").locatedBy("//button[@id='checkOutButton']");
    public static Target LABEL_TITLE_PRODUCT_PURCHASE = Target.the("Titulo del nombre del prodcuto seleccionado para compra").locatedBy("(//tr[@id='product']//child::h3)[2]");

}
