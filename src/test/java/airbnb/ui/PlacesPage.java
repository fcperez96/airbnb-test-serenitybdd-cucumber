package airbnb.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PlacesPage {

    public static final Target FILTER_BUTTON = Target.the("filter button")
            .locatedBy("(//div[@data-section-id='CATEGORY_FILTER_BAR']//child::button)[3]");
    public static final Target PLACE_CARD = Target.the("placer card")
            .locatedBy("(//div[@data-testid='card-container'])[2]");

}
