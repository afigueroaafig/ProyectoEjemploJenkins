package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;
import org.junit.Assert;

public class GoogleSteps {

    GooglePage google = new GooglePage();
    

    @Given("^abrir pagina de google$")
    public void navegarPaginaGoogle(){
        google.navegarPaginaGoogle();          
    }

    @When("^escribir (.+) en el buscador$")
    public void ingresarCriterioBusqueda(String textoBuscado){
        google.ingresarTexto(textoBuscado);
    }

    /* 
    @When("^escribir algo en el buscador$")
    public void ingresarCriterioBusqueda(){
        google.ingresarTexto("Selenium");
    }
    */

    @And("^presionar boton buscar$")
    public void hacerClickBoton(){
        google.clickBotonBusqueda();
    }

    @Then("^muestra resultado (.+)$")
    public void validateResults(String resultadoEsperado){
         Assert.assertEquals(resultadoEsperado, google.firstResult());
    }

    /* 
    @Then("^muestra resultado (.+)$")
    public void validateResults(){
         Assert.assertEquals("Selenium", google.firstResult());
    }
   */



}
