package com.shopping.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountPage extends PageObject {

    public static final Target INPUT_USER_NAME =Target.the("Campo de texto para ingresar el nombre").located(By.name("usernameRegisterPage"));
    public static final Target INPUT_EMAIL =Target.the("Campo de texto para ingresar el email").located(By.name("emailRegisterPage"));
    public static final Target INPUT_PASSWORD =Target.the("Campo de texto para ingresar el password").located(By.name("passwordRegisterPage"));
    public static final Target INPUT_CONFIRM_PASSWORD =Target.the("Campo de texto para ingresar el password").located(By.name("confirm_passwordRegisterPage"));
    public static final Target INPUT_FIRSTS_NAME =Target.the("Campo de texto para ingresar el primer nombre").located(By.name("first_nameRegisterPage"));
    public static final Target INPUT_LAST_NAME =Target.the("Campo de texto para ingresar el primer apellido").located(By.name("last_nameRegisterPage"));
    public static final Target INPUT_PHONE_NUMBER =Target.the("Campo de texto para ingresar el numero telefonico").located(By.name("phone_numberRegisterPage"));
    public static final Target DROP_DOWN_LIST_COUNTRY =Target.the("Lista desplegable para seleccionar el pais").located(By.name("countryListboxRegisterPage"));
    public static final Target INPUT_CITY =Target.the("Campo de texto para ingresar la ciudad ").located(By.name("cityRegisterPage"));
    public static final Target INPUT_ADDRESS =Target.the("Campo de texto para ingresar la direccion ").located(By.name("addressRegisterPage"));
    public static final Target INPUT_STATE =Target.the("Campo de texto para ingresar el estado ").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target INPUT_POSTAL_CODE =Target.the("Campo de texto para ingresar el codigo postal ").located(By.name("postal_codeRegisterPage"));
    public static final Target CHECKLIST_TERMS_CONDITIONS=Target.the("Checklist para seleccionar los terminos y condiciones ").located(By.name("i_agree"));
    public static final Target BUTTON_REGISTER=Target.the("Boton para registrar la cuenta").located(By.id("register_btnundefined"));
    public static final Target BUTTON_USER =Target.the("Label").locatedBy("//span[@class='hi-user containMiniTitle ng-binding'][text()='{0}']");

}
