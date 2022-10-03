package com.shopping.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.HomePage.url")
public class HomePage extends PageObject {
    public static final Target USER_MENU_ICON =Target.the("Icono para acceder al menu del usuario").located(By.id("menuUser"));
    public static final Target CLOSE_ICON =Target.the("Icono para cerrar la ventana de login").locatedBy("//div[@class='closeBtn loginPopUpCloseBtn']");
    public static final Target INPUT_USERNAME_LOGIN =Target.the("Campo de texto para ingresar el usuario de la cuenta").located(By.name("username"));
    public static final Target INPUT_PASSWORD_LOGIN =Target.the("Campo de texto para ingresar el password de la cuenta").located(By.name("password"));
    public static final Target BUTTON_SIGN_IN_LOGIN =Target.the("Boton para ingresar a la cuenta").locatedBy("//button[@id='sign_in_btnundefined']");
    public static final Target LABEL_CREATE_NEW_ACCOUNT = Target.the("Label para crear nueva cuenta ").locatedBy("//a[@class='create-new-account ng-scope']");
    public static final Target CHECK_BUTTON_SPECIAL_OFFER=Target.the("Check button offer ").locatedBy("//article[@id='special_offer_items']/child::h3");
    public static final Target LABEL_TITLE=Target.the("Title of page ").locatedBy("//span[text()='dvantage']");

}
