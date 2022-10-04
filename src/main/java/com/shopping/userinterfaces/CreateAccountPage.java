package com.shopping.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountPage extends PageObject {

    public static final Target INPUT_USER_NAME = Target.the("Text field to enter the name").located(By.name("usernameRegisterPage"));
    public static final Target INPUT_EMAIL = Target.the("Text field to enter the email").located(By.name("emailRegisterPage"));
    public static final Target INPUT_PASSWORD = Target.the("Text field to enter the password").located(By.name("passwordRegisterPage"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Text field to confirm password").located(By.name("confirm_passwordRegisterPage"));
    public static final Target INPUT_FIRSTS_NAME = Target.the("Text field to enter the first name").located(By.name("first_nameRegisterPage"));
    public static final Target INPUT_LAST_NAME = Target.the("Text field to enter the first surname").located(By.name("last_nameRegisterPage"));
    public static final Target INPUT_PHONE_NUMBER = Target.the("Text field to enter the phone number").located(By.name("phone_numberRegisterPage"));
    public static final Target DROP_DOWN_LIST_COUNTRY = Target.the("Drop-down list to select the country").located(By.name("countryListboxRegisterPage"));
    public static final Target INPUT_CITY = Target.the("Text field to enter the city").located(By.name("cityRegisterPage"));
    public static final Target INPUT_ADDRESS = Target.the("Text field to enter the address").located(By.name("addressRegisterPage"));
    public static final Target INPUT_STATE = Target.the("Text field to enter the status").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Text field to enter the postal code").located(By.name("postal_codeRegisterPage"));
    public static final Target CHECKLIST_TERMS_CONDITIONS = Target.the("Checklist to select the terms and conditions").located(By.name("i_agree"));
    public static final Target BUTTON_REGISTER = Target.the("Boton para registrar la cuenta").located(By.id("register_btnundefined"));
    public static final Target BUTTON_USER = Target.the("User profile button").locatedBy("//span[@class='hi-user containMiniTitle ng-binding'][text()='{0}']");

}
