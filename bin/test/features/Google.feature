Feature: Probar la busqueda en google

@Test
Scenario: Busco algo en google
    Given abrir pagina de google
    When escribir algo en el buscador
    And presionar boton buscar
    Then muestra resultado