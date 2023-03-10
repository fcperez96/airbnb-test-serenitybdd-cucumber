package airbnb.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FilterForm {

    public static Target PRICE_FILTER_MIN = Target.the("price filter min")
            .locatedBy("#price_filter_min");
    public static Target PRICE_FILTER_MAX = Target.the("price filter max")
            .locatedBy("#price_filter_max");
    public static Target SHOW_PLACES_BUTTON = Target.the("show places button")
            .locatedBy("//div[@data-section-id='COMPOSITE_FILTER_FOOTER_ALL_FILTERS:TAB_ALL_HOMES']//child::a");

}
