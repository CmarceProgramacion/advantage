package com.shopping.stepdefinitions;

import com.shopping.models.AccountModel;
import com.shopping.questions.ValidateProduct;
import com.shopping.questions.ValidateUser;
import com.shopping.tasks.BuyProductTask;
import com.shopping.tasks.CreateAccount;
import com.shopping.tasks.EnterAccountTask;
import com.shopping.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.shopping.userinterfaces.HomePage.CHECK_BUTTON_SPECIAL_OFFER;

public class BuyOnlineAdvantageStepdefinitions {

    @Before
    public void initialConfing() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Lucia");
    }


    @Given("that I access the advantage online shopping platform")
    public void thatIAccessTheAdvantageOnlineShoppingPlatform() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.browserOn().the(HomePage.class),
                WaitUntil.the(CHECK_BUTTON_SPECIAL_OFFER, WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds()
        );
    }

    @When("who made the registration for the creation of the account")
    public void whoMadeTheRegistrationForTheCreationOfTheAccount(List<List<String>> dataAccount) {
        AccountModel Account = new AccountModel(dataAccount.get(0));
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateAccount.withData(Account)
        );

    }

    @When("I add the item to the cart I proceed to the payment")
    public void IAddTheItemToTheCartIProceedToThePayment(List<List<String>> dataAccount) {
        AccountModel account = new AccountModel(dataAccount.get(0).get(0), dataAccount.get(0).get(1));
        String category = dataAccount.get(0).get(2);
        String product = dataAccount.get(0).get(3);
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterAccountTask.withData(account),
                BuyProductTask.withData(category, product)
        );

    }

    @Then("I verify that the account was created {string}")
    public void IVerifyThatTheAccountWasCreated(String userName) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUser.verify(userName)));
    }

    @Then("I verify the payment order with the product {string}")
    public void IVerifyThePaymentOrderWithTheProduct(String userName) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateProduct.verify(userName)));
    }
}
