package airbnb.questions;

import airbnb.ui.SelectPlacePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheNumberOfGuests implements Question<Integer> {

    public static TheNumberOfGuests is(){
        return new TheNumberOfGuests();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        WaitUntil.the(SelectPlacePage.GUESTS_NUMBER, isVisible()).performAs(actor);
        String guestNumerText = Text.of(SelectPlacePage.GUESTS_NUMBER).answeredBy(actor);
        return Integer.valueOf(guestNumerText.replaceAll("\\D+", ""));
    }
}
