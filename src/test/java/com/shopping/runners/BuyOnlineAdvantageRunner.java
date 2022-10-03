package com.shopping.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_online_advantage.feature",
        glue = "com.shopping.stepdefinitions",
        tags = "@CaseTwo",
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class BuyOnlineAdvantageRunner {
}
