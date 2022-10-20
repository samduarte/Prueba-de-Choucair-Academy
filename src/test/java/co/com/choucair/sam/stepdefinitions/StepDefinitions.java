package co.com.choucair.sam.stepdefinitions;

import co.com.choucair.sam.model.DataFull;
import co.com.choucair.sam.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^create a new user for the page Utest$")
    public void createANewUserForThePageUtest() {
        OnStage.theActorCalled("SamDuarte").wasAbleTo(OpenUp.thePage());
    }

    @When("^the user enters the required data in the form$")
    public void theUserEntersTheRequiredDataInTheForm(List <DataFull> DataPage) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillInformationPage.thePage(DataPage),
                FillCiudadPega.thePage(DataPage), FillDevice.thePage(DataPage), FillPass.thePage(DataPage));

    }

    @Then("^ends with user registration$")
    public void endsWithUserRegistration() {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }
}
