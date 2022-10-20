package co.com.choucair.sam.tasks;

import co.com.choucair.sam.model.DataFull;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static co.com.choucair.sam.userinterface.AdressPage.*;
import java.util.List;



public class FillCiudadPega implements Task {


    private List<DataFull> DataPage;


    public FillCiudadPega (List<DataFull> DataPage) {
        this.DataPage = DataPage;
    }

    public static FillCiudadPega thePage(List<DataFull> DataPage) {
        return Tasks.instrumented(FillCiudadPega.class, DataPage);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(DataPage.get(0).getStrCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                Enter.theValue(DataPage.get(0).getStrPostal()).into(POSTAL),
                Click.on(CONTAINER_COUNTRY_NAME),
                Enter.theValue(DataPage.get(0).getStrPais()).into(COUNTRY_NAME).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LOCATION_BUTTON)


        );
    }
}
