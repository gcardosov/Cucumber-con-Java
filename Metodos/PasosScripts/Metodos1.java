package PasosScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Metodos1 {
	
	WebDriver driver;
	Alert alertWindow;
	
	@Given("^Abrir el navegador y la pagina$")
	public void abrir_el_navegador_y_la_pagina() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Denifimos que navegador vamos a usar 
		//pasamos los 2 parametros del metodo, driver y path
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		//invocamos una instancia del driver
		driver = new ChromeDriver(); 
		//Instruccion para abrir una pagina con SELENIUM	
		System.out.println("Se abre el navegador y la pagina" );
		System.out.println("https://www.demoblaze.com/index.html");
		driver.get("https://www.demoblaze.com/index.html");	
		//Esperamos
		Thread.sleep(3000);
		//Se maximiza la ventana del navegador
		System.out.println("Se maximiza la ventana del navegador");
		driver.manage().window().maximize();
		//throw new PendingException();
	}

	@Given("^una vez que se abra dar el usuario y password$")
	public void una_vez_que_se_abra_dar_el_usuario_y_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Se escribe usuario y password");
		//throw new PendingException();
	}

	@When("^Se inicia sesion$")
	public void se_inicia_sesion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se inicia sesion");
	    //throw new PendingException();
	}

	@When("^realizas una accion$")
	public void realizas_una_accion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se realiza una accion");
	    //throw new PendingException();
	}

	@When("^validas otra accion$")
	public void validas_otra_accion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se realiza otra accion");
	    //throw new PendingException();
	}

	@Then("^Cuando termines de validar$")
	public void cuando_termines_de_validar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se termina de validar");
	    //throw new PendingException();
	}

	@Then("^realiza log out$")
	public void realiza_log_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se realiza log out ");
	    //throw new PendingException();
	}
	
	
	//METODOS DE TAG DEMOBLAZE 
	

	
	@When("^dar click en login$")
	public void dar_click_en_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		
		driver.findElement(By.id("login2")).click();
		System.out.println("Click en login");
		Thread.sleep(3000);
	    //throw new PendingException();
	}


	@When("^Se ingresa userName \"([^\"]*)\"$")
	public void se_ingresa_userName(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pasamos UserNme");	
		driver.findElement(By.id("loginusername")).sendKeys("NOSE1");		
		//throw new PendingException();	    	    	
	}
	
	@When("^Se ingresa password \"([^\"]*)\"$")
	public void se_ingresa_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pasamos password");
		driver.findElement(By.id("loginpassword")).sendKeys("NOSE1");		
		//throw new PendingException();
	}
	
	
	@When("^dar click en btn login$")
	public void dar_click_en_btn_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
		System.out.println("Click al boton de login");
		//throw new PendingException();
	}
	
	
	/*@When("^aceptar en alerta$")
	public void aceptar_en_alerta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//throw new PendingException();
	}*/
	
	
	@Then("^Cierra el navagador$")
	public void cierra_el_navagador() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(3000);
		driver.close();
		System.out.println("Cerramos el navegador");
	
	}
	
	
	
}
