package airbnb.tasks;

import airbnb.ui.PlacesPage;
import airbnb.ui.SelectPlacePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterTo implements Task {

    public static EnterTo secondPlaceFiltered(){
        return new EnterTo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PlacesPage.PLACE_CARD, isClickable()),
                Click.on(PlacesPage.PLACE_CARD),
                Switch.toTheOtherWindow(),
                WaitUntil.the(SelectPlacePage.CLOSE_TRANSLATION_MODAL, isVisible()),
                Click.on(SelectPlacePage.CLOSE_TRANSLATION_MODAL)
        );
    }
}
