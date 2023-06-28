@Grid 
Feature: Probar menu en openwebinars

@Smoke 
Scenario: Entrar a paginas del menu principal
    Given abrir pagina de openwebinars
    When presionar el boton carrera del menu
    Then mostrar pagina de carrera

@Smoke
Scenario: Verificar titulo de HomePage
    Given abrir pagina de openwebinars para validar titulo
    Then validar titulo de pagina