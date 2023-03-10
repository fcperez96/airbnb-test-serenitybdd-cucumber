package airbnb.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class SearchForPlacesAirbnb {

    @Given("{actor} is on the Airbnb homepage")
    public void actorIsOnTheAirbnbHomepage(Actor actor) {
    }

    @When("{actor} search for {string} and {int} adult guests")
    public void heSearchForAndAdultGuests(Actor actor, String locationName, int numberOfGuests) {
    }

    @And("{actor} select the price range {int} - {int} as filter")
    public void heSelectThePriceRangeAsFilter(Actor actor, int priceMin, int priceMax) {
    }

    @Then("{actor} should see a place with the conditions he is looking for")
    public void heShouldSeeAPlaceWithTheConditionsHeIsLookingFor(Actor actor) {
    }

}
