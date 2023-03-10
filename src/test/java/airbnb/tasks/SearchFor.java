package airbnb.tasks;

import airbnb.ui.SearchForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchFor implements Task {

    private String locationName;
    private int numberOfGuests;

    public SearchFor(String locationName, int numberOfGuests) {
        this.locationName = locationName;
        this.numberOfGuests = numberOfGuests;
    }

    public static SearchFor locationAndGuests(String locationName, int numberOfGuests) {
        return new SearchFor(locationName, numberOfGuests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchForm.SEARCH_BAR).afterWaitingUntilEnabled(),
                Click.on(SearchForm.ANYWHERE_INPUT),
                Enter.theValue(this.locationName)
                        .into(SearchForm.ANYWHERE_INPUT),
                Click.on(SearchForm.GUESTS_INPUT)
        );
        for (int i = 0; i < this.numberOfGuests; i++){
            Click.on(SearchForm.ADULT_GUEST_INCREASE).performAs(actor);
        }
        Click.on(SearchForm.SUBMIT_SEARCH).performAs(actor);
    }
}
