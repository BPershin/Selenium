package proj.stepsCuc;

import org.junit.Assert;
import proj.Pages.BaseTests;
import proj.Pages.TripCreationPage;
import io.cucumber.java.ru.И;

public class TripsCreationStepsCuc extends BaseTests {
    TripCreationPage tripCreationPage = new TripCreationPage();

    @И("^Выбираем подразделение из списка (.+)")
    public void setSubdivision(String subdivision) {
        tripCreationPage.clickSubdivisionExpandButton();
        tripCreationPage.selectSubdivision(subdivision);
    }

    @И("^Выбираем принимающую организацию (.+)")
    public void setHostOrg(String hostOrg) {
        tripCreationPage.clickToHostOrganisationList();
        tripCreationPage.expandHostOrganisationList();
        tripCreationPage.selectHostOrganisationFromList(hostOrg);
    }

    @И("^Проставляем задачу (.+)")
    public void setTask(String taskName) {
        tripCreationPage.selectTasksCheckBox(taskName);
    }

    @И("^Проставляем город вылета (.+) и город прибытия (.+)")
    public void setDepAndArrCity(String departureCity, String arivalCity) {
        tripCreationPage.setDepartureCity(departureCity);
        tripCreationPage.setArrivalCity(arivalCity);
    }

    @И("^Проставляем дату вылета (.+) и дату прилета (.+)")
    public void setDepAndArrDate(String departureDate, String arrivalDate) {
        tripCreationPage.setDepartureDate(departureDate);
        tripCreationPage.setArrivalDate(arrivalDate);
    }

    @И("Жмем Сохранить и закрыть")
    public void clickSaveAndClose() {
        tripCreationPage.saveAndClose();
    }

    @И("Сравниваем фактический текст ошибки с ожидаемым")
    public void alertCheck() {
        String expected = "Список командируемых сотрудников не может быть пустым";
        Assert.assertEquals(expected, getAlertOfValidation());
    }
}
