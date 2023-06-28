@Grid 
Feature: Probar la busqueda en google

@Test 
Scenario Outline: Busco algo en google
    Given abrir pagina de google
    When escribir <textoBuscado> en el buscador
    And presionar boton buscar
    Then muestra resultado <resultadoEsperado>

    Examples:
        | textoBuscado | resultadoEsperado |
        | selenium     | selenium          | 
        | cucumber     | OtraCosa....      | 
