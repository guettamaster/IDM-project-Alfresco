package com.aimprosoft;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {//"src/test/resources/SignInPage.feature",
        "src/test/resources/HomePage.feature"
})
public class DefinitionTestSuite {}
