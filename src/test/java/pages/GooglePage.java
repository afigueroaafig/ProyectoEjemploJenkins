package pages;

public class GooglePage extends BasePage{
    //private String botonBusqueda = "//div[@class='lJ9FBc']//input[@name='btnK']";
    private String botonBusqueda = "//*[@value='Buscar con Google']";
    
    private String campoTexto = "//textarea[@id='APjFqb']";
    private String url = "https://www.google.com";
    private String firstResult = "//*[@id=\"APjFqb\"]";

    public GooglePage(){
    super(driver);
    }
    public void navegarPaginaGoogle(){
    navigateTo(url);
    }
    public void clickBotonBusqueda(){
    clickElement(botonBusqueda);
    }
    public void ingresarTexto(String textoBuscado){
    ingresarBusqueda(campoTexto, textoBuscado);
    }
    public String firstResult(){
    return  textFromElement(firstResult);
    }
   

}
