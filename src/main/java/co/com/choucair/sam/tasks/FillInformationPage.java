package co.com.choucair.sam.tasks;


import co.com.choucair.sam.model.DataFull;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static co.com.choucair.sam.userinterface.InformationPage.*;
import org.openqa.selenium.Keys;


import java.util.List;


public class FillInformationPage implements Task {

    private List<DataFull> DataPage;

    public FillInformationPage(List<DataFull> DataPage) {
        this.DataPage = DataPage;
    }

    public static FillInformationPage thePage(List<DataFull> DataPage) {
        return Tasks.instrumented(FillInformationPage.class, DataPage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(DataPage.get(0).getStrName()).into(NAME),
                Enter.theValue(DataPage.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(DataPage.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(DataPage.get(0).getStrMesCumpleanos()).from(BIRTHDAY_MONTH),
                SelectFromOptions.byVisibleText(DataPage.get(0).getStrDiaCumpleanos()).from(BIRTHDAY_DAY),
                SelectFromOptions.byVisibleText(DataPage.get(0).getStrAnoCumpleanos()).from(BIRTHDAY_YEAR),
                Click.on(LANGUAJE_SPOKEN),
                Enter.theValue(DataPage.get(0).getStrLenguajesHablado()).into(LANGUAJE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LOCATION_BUTTON)

        );

    }
}
