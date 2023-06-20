package pages;

public class OpenWebinarsPage extends BasePage{
    private String botonBusqueda = "//li[@class='menu__item']//a[normalize-space()='Carreras']";
    private String url = "https://openwebinars.net/";
    private String firstResult = "//h1[@class='hero-secondary__title col-lg-6']";

    public OpenWebinarsPage(){
    super(driver);
    }
    public void navegarPaginaOpenWebinars(){
    navigateTo(url);
    }
    public void clickBotonBusqueda(){
    clickElement(botonBusqueda);
    }
    public String firstResult(){
    return  textFromElement(firstResult);
    }
    public String titleResult(){
    return  driver.getTitle();
    }
    
}
