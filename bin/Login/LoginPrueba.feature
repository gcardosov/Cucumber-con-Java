@tag
Feature: Realizar un login sobre una pagina
  I want to use this template for my feature file

  @tag1
  Scenario: Realiza login con datos validos
    Given Abrir el navegador y la pagina
    And una vez que se abra dar el usuario y password
    When Se inicia sesion 
    And realizas una accion
    And validas otra accion
    Then Cuando termines de validar
    And realiza log out

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
