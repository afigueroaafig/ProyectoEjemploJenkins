package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OpenWebinarsPage;

import org.junit.Assert;

public class OpenWebinarsSteps {

OpenWebinarsPage OpenWebinars = new OpenWebinarsPage();


    @Given("^abrir pagina de openwebinars$")
    public void navegarPaginaGoogle(){
        OpenWebinars.navegarPaginaOpenWebinars();
    }

    @When("^presionar el boton carrera del menu$")
    public void hacerClickBoton(){
        OpenWebinars.clickBotonBusqueda();
    }

    @Then("^mostrar pagina de carrera$")
    public void validateResults(){
         Assert.assertEquals("Carreras", OpenWebinars.firstResult());
    }


}