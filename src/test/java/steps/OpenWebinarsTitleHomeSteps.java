package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.OpenWebinarsPage;
import org.junit.Assert;

public class OpenWebinarsTitleHomeSteps {

OpenWebinarsPage OpenWebinars = new OpenWebinarsPage();


    @Given("^abrir pagina de openwebinars para validar titulo$")
    public void navegarPaginaGoogle(){
        OpenWebinars.navegarPaginaOpenWebinars();
        
   }

    @Then("^validar titulo de pagina$")
    public void validateResults(){
         Assert.assertEquals("Cursos online de Programaci\u00F3n y Sistemas en v\u00EDdeo | OpenWebinarsAAA", OpenWebinars.titleResult());
    }


}