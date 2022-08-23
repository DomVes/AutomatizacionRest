package stepDefinition;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.CrearPetSteps;

public class CrearPetStepDefinition {
    @Steps
    CrearPetSteps objeto = new CrearPetSteps();


    @Cuando("^se envian las operaciones de los servicios$")
    public void seEnvianLasOperacionesDeLosServicios() {
        objeto.crearUser();
        objeto.crearOrden();
    }

    @Entonces("^valida que el codigo de status sea (.*)$")
    public void validaQueElCodigoDeStatusSea(int arg1) {
        objeto.validarUser();
        objeto.crearOrden();
    }

}
