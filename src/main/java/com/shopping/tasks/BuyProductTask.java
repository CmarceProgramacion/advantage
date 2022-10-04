package com.shopping.tasks;

import com.shopping.interactions.FindProductAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.shopping.userinterfaces.ProductCategory.IMAGE_CATEGORY_PRODUCT;
import static com.shopping.userinterfaces.ProductCategory.LIST_NAME_PRODUCTS;
import static com.shopping.userinterfaces.ProductPage.*;

public class BuyProductTask implements Task {

    private String category;
    private String product;

    public BuyProductTask(String category, String product) {
        this.category = category;
        this.product = product;
    }

    public static Performable withData(String category, String product) {
        return Tasks.instrumented(BuyProductTask.class, category, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IMAGE_CATEGORY_PRODUCT.of(category)),
                FindProductAction.findAndSelect(product, LIST_NAME_PRODUCTS),
                WaitUntil.the(TITLE_PRODUCT.of(product), WebElementStateMatchers.isVisible()).forNoMoreThan(4).seconds(),
                Ensure.that(TITLE_PRODUCT.of(product)).text().containsIgnoringCase(product),
                WaitUntil.the(BUTTON_SAVE_PRODUCT, WebElementStateMatchers.isClickable()),
                Click.on(BUTTON_SAVE_PRODUCT),
                Click.on(BUTTON_SHOPPING_CART),
                Click.on(BUTTON_CHECKOUT_PURCHASE)
        );
    }
}
