package com.shopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductCategory extends PageObject {
    public static Target IMAGE_CATEGORY_PRODUCT = Target.the("Product category image").locatedBy("//div[contains(@id,'{0}')]");

    public static Target LIST_NAME_PRODUCTS = Target.the("Product name list").locatedBy("//a[@class='productName ng-binding']");


}
