package com.aimprosoft;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {
        //"src/test/resources/01.SignInPage.feature",
        "src/test/resources/02.AddingAUserToTheHRGroup.feature",
//        "src/test/resources/04.GenerationOfDocumentsForUser.feature"

})
public class DefinitionTestSuite {}
