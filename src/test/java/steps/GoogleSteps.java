package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

GooglePage google = new GooglePage();


    @Given("^abrir pagina de google$")
    public void navegarPaginaGoogle(){
        google.navegarPaginaGoogle();
        
    }

    @When("^escribir algo en el buscador$")
    public void ingresarCriterioBusqueda(){
        google.ingresarTexto("Selenium");
    }

    @And("^presionar boton buscar$")
    public void hacerClickBoton(){
        google.clickBotonBusqueda();
        google.salirPagina();
    }

    @Then("^muestra resultado$")
    public void validarResultado(){

    }



}