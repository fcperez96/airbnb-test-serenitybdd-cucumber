package airbnb.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SelectPlacePage {

    public static final Target CLOSE_TRANSLATION_MODAL = Target.the("close translation modal")
            .locatedBy("(//div[@role = 'dialog']//button)[1]");
    public static final Target PLACE_PRICE = Target.the("place price")
            .locatedBy("(//div[@data-section-id='BOOK_IT_SIDEBAR']//button)[4]//div");
    public static final Target GUESTS_NUMBER = Target.the("number of guests")
            .locatedBy("//div[@data-section-id='OVERVIEW_DEFAULT']//ol//li[1]");

}
