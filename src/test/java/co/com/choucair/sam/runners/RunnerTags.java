package co.com.choucair.sam.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feactures/academyChoucair.feature",
        tags = "@stories",
        glue = "co.com.choucair.sam.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags{

}