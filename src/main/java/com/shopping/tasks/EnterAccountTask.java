package com.shopping.tasks;


import com.shopping.models.AccountModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.shopping.userinterfaces.CreateAccountPage.BUTTON_USER;
import static com.shopping.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class EnterAccountTask implements Task {
    private AccountModel accountModel;

    public EnterAccountTask(AccountModel accountModel) {
        this.accountModel = accountModel;
    }

    public static Performable withData(AccountModel accountModel) {
        return Tasks.instrumented(EnterAccountTask.class, accountModel);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_MENU_ICON),
                Enter.theValue(accountModel.getUserName()).into(INPUT_USERNAME_LOGIN),
                Enter.theValue(accountModel.getPassword()).into(INPUT_PASSWORD_LOGIN),
                WaitUntil.the((BUTTON_SIGN_IN_LOGIN), isClickable()),
                Click.on(BUTTON_SIGN_IN_LOGIN),
                WaitUntil.the(BUTTON_USER.of(accountModel.getUserName()), isVisible()).forNoMoreThan(20).seconds()
        );

    }
}
