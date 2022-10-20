package co.com.choucair.sam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdressPage {

    public static final Target CIUDAD= Target.the("Label para ingresar la ciudad").
            located(By.id("city"));

    public static final Target POSTAL = Target.the("Label para ingresar el codigo postal").
            located(By.id("zip"));

    public static final Target CONTAINER_COUNTRY_NAME = Target.the("Contenedor del pais de residencia del usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));

    public static final Target COUNTRY_NAME = Target.the("Seleccionar pais de residencia del usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));



    public static final Target LOCATION_BUTTON = Target.the("Boton para seguir con el formulario de cuenta de tu dispositivo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));


}
