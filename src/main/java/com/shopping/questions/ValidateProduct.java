package com.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.shopping.userinterfaces.ProductPage.LABEL_TITLE_PRODUCT_PURCHASE;

public class ValidateProduct implements Question<Boolean> {
    private String nameProduct;

    public ValidateProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public static ValidateProduct verify(String nameProduct){
        return new ValidateProduct(nameProduct);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LABEL_TITLE_PRODUCT_PURCHASE.resolveFor(actor).getTextContent().contains(nameProduct);
    }
}
