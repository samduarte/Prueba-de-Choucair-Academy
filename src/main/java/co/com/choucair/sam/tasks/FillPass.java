package co.com.choucair.sam.tasks;


import co.com.choucair.sam.model.DataFull;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.sam.userinterface.PassPage.*;

public class FillPass implements Task {

    private List<DataFull> DataPage;

    public FillPass(List<DataFull> DataPage) {
        this.DataPage = DataPage;
    }

    public static FillPass thePage(List<DataFull> DataPage) {
        return Tasks.instrumented(FillPass.class, DataPage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(DataPage.get(0).getStrContrase()).into(CONTRA),
                Enter.theValue(DataPage.get(0).getStrConFIR()).into(CONFIRMA),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_STAY_GUIDELINES),
                Click.on(CHECK_STAY_POLICY),
                Click.on(LOCATION_BUTTON)
                );

    }
}
