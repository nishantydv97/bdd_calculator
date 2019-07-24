package com.amdocs.bdd_calculator;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	Calculator calculator;
	double actual;
	@Given("A Calculator To Perform Addition")
	
	public void a_Calculator_To_Perform_Addition() {
	    	calculator = new Calculator();
	}

	@When("The Input Is {string} And {string}")
	public void the_Input_Is_And(String first, String second) {
	    actual = calculator.addition(Double.parseDouble(first), Double.parseDouble(second));
	}

	@Then("The Output Is {string}")
	public void the_Output_Is(String string) {
		double expected = 10.4;
		assertEquals(expected, actual, 0.00001);
	}

}
