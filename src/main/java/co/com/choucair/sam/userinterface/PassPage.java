package co.com.choucair.sam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PassPage {

    public static final Target CONTRA = Target.the("Label para ingresar la creacion de la contraseña ").
            located(By.id("password"));

    public static final Target CONFIRMA = Target.the("Label para ingresar es para la confirmacion de la contraseña").
            located(By.id("confirmPassword"));

    public static final Target CHECK_STAY_INFORMED = Target.the("CheckBox STAY INFORMED!").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECK_STAY_GUIDELINES = Target.the("CheckBox STAY GUIDELINES!").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_STAY_POLICY = Target.the("CheckBox STAY POLICY! es para aceptar las poslitivas de privasidad").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target LOCATION_BUTTON = Target.the("Boton para seguir con el formulario de ubicacion")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
