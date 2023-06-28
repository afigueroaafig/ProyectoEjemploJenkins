Feature: Ejemplo de request

@Api 
Scenario: Prueba GET al endpoint
    Given enviar un request al endpoint
    Then consigo una lista de 10 usuarios
    