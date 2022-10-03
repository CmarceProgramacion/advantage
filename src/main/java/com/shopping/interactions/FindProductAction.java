package com.shopping.interactions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class FindProductAction implements Interaction {

    private String nameProduct;
    private Target target;

    public FindProductAction(String nameProduct, Target target) {
        this.nameProduct = nameProduct;
        this.target = target;
    }

    public static Performable findAndSelect(String nameProduct, Target target) {
        return Tasks.instrumented(FindProductAction.class, nameProduct, target);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> list = target.resolveAllFor(actor);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTextContent().equals(nameProduct)) {
                Click.on(list.get(i)).performAs(actor);
                i = list.size();
            }
        }

//        List<WebElementFacade> list = target.resolveAllFor(actor);
//
//        for (WebElementFacade element : list) {
//            if (element.getTextContent().equals(nameProduct)) {
//                Click.on(element).performAs(actor);
//            }
//        }


    }
}
