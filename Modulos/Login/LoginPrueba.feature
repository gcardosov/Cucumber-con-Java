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
    
  @tagDemoBlaze
  Scenario: Login usuario
    Given Abrir el navegador y la pagina
    When dar click en login 
 		And Se ingresa userName "GeraPruebas"
 		And Se ingresa password "password"
 		And dar click en btn login
 		#And aceptar en alerta 
 		Then Cierra el navagador
    


      
