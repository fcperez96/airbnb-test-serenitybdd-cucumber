package airbnb.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theAirbnbHomePage(){
        return Task.where("{0} opens the Airbnb home page",
                Open.browserOn().the(AirbnbHomePage.class)
        );
    }

}
