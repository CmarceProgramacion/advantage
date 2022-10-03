package com.shopping.tasks;

import com.shopping.interactions.FindProductAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.shopping.userinterfaces.ProductCategory.IMAGE_CATEGORY_PRODUCT;
import static com.shopping.userinterfaces.ProductCategory.LIST_NAME_PRODUCTS;
import static com.shopping.userinterfaces.ProductPage.TITLE_PRODUCT;

public class BuyProductTask implements Task {
    private String product;

    public BuyProductTask(String product) {
        this.product = product;
    }

    public static Performable withData(String product) {
        return Tasks.instrumented(BuyProductTask.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IMAGE_CATEGORY_PRODUCT),
                FindProductAction.findAndSelect("HP ENVY - 17t Touch Laptop", LIST_NAME_PRODUCTS),
                Ensure.that(TITLE_PRODUCT.of(product)).text().contains(product)
        );

    }
}
