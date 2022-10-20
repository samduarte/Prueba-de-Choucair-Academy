package co.com.choucair.sam.tasks;

import co.com.choucair.sam.model.DataFull;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import java.util.List;
import static co.com.choucair.sam.userinterface.DevicePage.*;

public class FillDevice implements Task {

    private List<DataFull> DataPage;


    public FillDevice (List<DataFull> DataPage) {
        this.DataPage = DataPage;
    }

    public static FillDevice thePage(List<DataFull> DataPage) {
        return Tasks.instrumented(FillDevice.class, DataPage);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(COMPUTER),
                Enter.theValue(DataPage.get(0).getStrCompu()).into(COMPUTER_SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(VERSION),
                Enter.theValue(DataPage.get(0).getStrVersion()).into(VERSION_SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(IDIOMA),
                Enter.theValue(DataPage.get(0).getStrIdioma()).into(IDIOMA_SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MOVIL),
                Enter.theValue(DataPage.get(0).getStrMovil()).into(MOVIL_SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MODELO),
                Enter.theValue(DataPage.get(0).getStrModelo()).into(MODELO_SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SISTEMA),
                Enter.theValue(DataPage.get(0).getStrSistema()).into(SISTEMA_SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LOCATION_BUTTON)

                );


    }
}
