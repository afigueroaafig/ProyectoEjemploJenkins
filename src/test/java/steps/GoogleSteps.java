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
        System.out.println("Abrir pagina......................");
           
        
    }

    @When("^escribir algo en el buscador$")
    public void ingresarCriterioBusqueda(){
        google.ingresarTexto("Selenium");
        System.out.println("Escribir en el buscador......................");
    }

    @And("^presionar boton buscar$")
    public void hacerClickBoton(){
        google.clickBotonBusqueda();
        System.out.println("Hacer click en boton......................");
        google.salirPagina();
        System.out.println("Salir de pagina......................");
    }

    @Then("^muestra resultado$")
    public void validarResultado(){

    }



}