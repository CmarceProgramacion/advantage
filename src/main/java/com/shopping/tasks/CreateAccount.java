package com.shopping.tasks;

import com.shopping.models.AccountModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.shopping.userinterfaces.CreateAccountPage.*;
import static com.shopping.userinterfaces.HomePage.*;

public class CreateAccount implements Task {
    private AccountModel account;

    public CreateAccount(AccountModel account) {
        this.account = account;
    }

    public static Performable withData(AccountModel account) {
        return Tasks.instrumented(CreateAccount.class, account);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(USER_MENU_ICON),
                WaitUntil.the(LABEL_CREATE_NEW_ACCOUNT, WebElementStateMatchers.isClickable()).forNoMoreThan(3).seconds(),
                Click.on(LABEL_CREATE_NEW_ACCOUNT),
                Enter.theValue(account.getUserName()).into(INPUT_USER_NAME),
                Enter.theValue(account.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(account.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(account.getPassword()).into(INPUT_CONFIRM_PASSWORD),
                Enter.theValue(account.getFirstsName()).into(INPUT_FIRSTS_NAME),
                Enter.theValue(account.getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(account.getPhoneNumber()).into(INPUT_PHONE_NUMBER),
                SelectFromOptions.byVisibleText(account.getCountry()).from(DROP_DOWN_LIST_COUNTRY),
                Enter.theValue(account.getCity()).into(INPUT_CITY),
                Enter.theValue(account.getAddress()).into(INPUT_ADDRESS),
                Enter.theValue(account.getState()).into(INPUT_STATE),
                Enter.theValue(account.getPostalCode()).into(INPUT_POSTAL_CODE),
                Click.on(CHECKLIST_TERMS_CONDITIONS),
                Click.on(BUTTON_REGISTER),
                WaitUntil.the(LABEL_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Check.whether(CLOSE_ICON.isVisibleFor(actor)).andIfSo(Click.on(CLOSE_ICON)),
                WaitUntil.the(USER_MENU_ICON, WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds(),
                Click.on(USER_MENU_ICON)


        );

    }
}
