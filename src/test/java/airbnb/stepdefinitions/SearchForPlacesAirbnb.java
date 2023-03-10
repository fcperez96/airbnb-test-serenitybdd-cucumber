package airbnb.stepdefinitions;

import airbnb.navigation.NavigateTo;
import airbnb.questions.TheNumberOfGuests;
import airbnb.questions.ThePrice;
import airbnb.tasks.EnterTo;
import airbnb.tasks.FilterBy;
import airbnb.tasks.SearchFor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class SearchForPlacesAirbnb {

    @Given("{actor} is on the Airbnb homepage")
    public void actorIsOnTheAirbnbHomepage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAirbnbHomePage());
    }

    @When("{actor} search for {string} and {int} adult guests")
    public void heSearchForAndAdultGuests(Actor actor, String locationName, int numberOfGuests) {
        actor.remember("guestsNumber", numberOfGuests);
        actor.attemptsTo(
                SearchFor.locationAndGuests(locationName, numberOfGuests)
        );
    }

    @And("{actor} select the price range {int} - {int} as filter")
    public void heSelectThePriceRangeAsFilter(Actor actor, int priceMin, int priceMax) {
        actor.remember("priceMax", priceMax);
        actor.attemptsTo(
                FilterBy.priceRange(priceMin, priceMax)
        );
    }

    @Then("{actor} should see a place with the conditions he is looking for")
    public void heShouldSeeAPlaceWithTheConditionsHeIsLookingFor(Actor actor) {
        actor.attemptsTo(
                EnterTo.secondPlaceFiltered()
        );
        actor.should(
                seeThat("the price is below the maximum range", ThePrice.isBelowTheMaxPrice(),
                        equalTo(Boolean.TRUE)),
                seeThat("the number of guests is correct", TheNumberOfGuests.is(),
                        equalTo(actor.recall("guestsNumber")))
        );
    }

}
