package PasosScripts;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Metodos1 {
	
	@Given("^Abrir el navegador y la pagina$")
	public void abrir_el_navegador_y_la_pagina() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se abre el navegador y la pagina");
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
	public void validas_otra_acci_n() throws Throwable {
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

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("Se  ");
	    //throw new PendingException();
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("Se ");
	    //throw new PendingException();
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("Se ");
	    //throw new PendingException();
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("Se ");
	    //throw new PendingException();
	}
	
	

}
