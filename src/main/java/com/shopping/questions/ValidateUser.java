package com.shopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.shopping.userinterfaces.CreateAccountPage.BUTTON_USER;

public class ValidateUser implements Question<Boolean> {

    private String nameUser;

    public ValidateUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public static ValidateUser verify(String nameUser) {
        return new ValidateUser(nameUser);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BUTTON_USER.of(nameUser).isVisibleFor(actor);
    }
}
