package airbnb.questions;

import airbnb.ui.SelectPlacePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ThePrice implements Question<Boolean> {

    public static ThePrice isBelowTheMaxPrice(){
        return new ThePrice();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(SelectPlacePage.PLACE_PRICE, isVisible()).performAs(actor);
        String placePriceText = Text.of(SelectPlacePage.PLACE_PRICE).answeredBy(actor);
        String placePriceTextModify = placePriceText.substring(0,13);
        int placePrice = Integer.parseInt(placePriceTextModify.replaceAll("\\D+", ""));
        int priceMax = actor.recall("priceMax");
        return placePrice <= priceMax;
    }
}
