package airbnb.ui;


import net.serenitybdd.screenplay.targets.Target;

public class SearchForm {

    public static Target SEARCH_BAR = Target.the("search bar")
            .locatedBy("//div[@data-testid='little-search']");
    public static Target ANYWHERE_INPUT = Target.the("anywhere input")
            .locatedBy("#bigsearch-query-location-input");
    public static Target GUESTS_INPUT = Target.the("guest input")
            .locatedBy("//div[@data-testid='structured-search-input-field-guests-button']");
    public static Target ADULT_GUEST_INCREASE = Target.the("adult guest increase")
            .locatedBy("//button[@data-testid='stepper-adults-increase-button']");
    public static Target SUBMIT_SEARCH = Target.the("submit search")
            .locatedBy("//button[@data-testid='structured-search-input-search-button']");

}
