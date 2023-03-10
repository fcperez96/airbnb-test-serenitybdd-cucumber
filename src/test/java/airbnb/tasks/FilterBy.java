package airbnb.tasks;

import airbnb.ui.FilterForm;
import airbnb.ui.PlacesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.security.Key;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FilterBy implements Task {

    private int priceMinimum;
    private int priceMaximum;

    public FilterBy(int priceMinimum, int priceMaximum) {
        this.priceMinimum = priceMinimum;
        this.priceMaximum = priceMaximum;
    }

    public static FilterBy priceRange(int priceMinimum, int priceMaximum) {
        return new FilterBy(priceMinimum, priceMaximum);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PlacesPage.FILTER_BUTTON),
                WaitUntil.the(FilterForm.PRICE_FILTER_MIN, isVisible()),
                DoubleClick.on(FilterForm.PRICE_FILTER_MIN),
                Hit.the(Keys.DELETE).into(FilterForm.PRICE_FILTER_MIN),
                Enter.theValue(String.valueOf(this.priceMinimum))
                        .into(FilterForm.PRICE_FILTER_MIN),
                DoubleClick.on(FilterForm.PRICE_FILTER_MAX),
                Hit.the(Keys.DELETE).into(FilterForm.PRICE_FILTER_MAX),
                DoubleClick.on(FilterForm.PRICE_FILTER_MAX),
                Hit.the(Keys.DELETE).into(FilterForm.PRICE_FILTER_MAX),
                Enter.theValue(String.valueOf(this.priceMaximum))
                        .into(FilterForm.PRICE_FILTER_MAX),
                Click.on(FilterForm.SHOW_PLACES_BUTTON)
        );
    }
}
