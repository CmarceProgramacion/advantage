package com.shopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject {
    public static Target TITLE_PRODUCT = Target.the("Title of the selected product").locatedBy("//a[text()='{0}']");
    public static Target BUTTON_SAVE_PRODUCT = Target.the("Button to save the product").locatedBy("//button[@name='save_to_cart']");
    public static Target BUTTON_SHOPPING_CART = Target.the("Cart button").locatedBy("//a[@id='shoppingCartLink']");
    public static Target BUTTON_CHECKOUT_PURCHASE = Target.the("Purchase verification button").locatedBy("//button[@id='checkOutButton']");
    public static Target LABEL_TITLE_PRODUCT_PURCHASE = Target.the("Title of the name of the product selected for purchase").locatedBy("(//tr[@id='product']//child::h3)[2]");

}
