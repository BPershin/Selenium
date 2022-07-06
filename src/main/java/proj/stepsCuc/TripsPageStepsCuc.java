package proj.stepsCuc;

import io.cucumber.java.ru.И;
import proj.Pages.TripsPage;

public class TripsPageStepsCuc {
    TripsPage tripsPage = new TripsPage();

    @И("Нажимаем Создать Командировку")
    public void clickCreateTrip() {
       tripsPage.goToTripCreation();
    }

}
