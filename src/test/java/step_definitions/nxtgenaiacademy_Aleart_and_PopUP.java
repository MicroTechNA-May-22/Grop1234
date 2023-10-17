package step_definitions;

import org.openqa.selenium.By;

import Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class nxtgenaiacademy_Aleart_and_PopUP extends Base {

	@Given("I am in Landin Page")
	public void i_am_in_Landin_Page() {
		navigationURL("https://nxtgenaiacademy.com/");
	}

	@When("I mouse hober on Demo Sites")
	public void i_mouse_hober_on_Demo_Sites() {
		mouseHover(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a"));
	}

	@When("I mouse hover on Practice Automation")
	public void i_mouse_hover_on_Practice_Automation() {
		mouseHover(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/a"));
	}

	@When("I click on Demo Site-Alert and PopUp")
	public void i_click_on_Demo_Site_Alert_and_PopUp() {

	}

	@When("I click on Alert Box")
	public void i_click_on_Alert_Box() {

	}

	@When("I click on OK button, the allert goes away")
	public void i_click_on_OK_button_the_allert_goes_away() {

	}

	@When("I verify that I click on OK")
	public void i_verify_that_I_click_on_OK() {

	}

	@When("I click on Conform Alert Box")
	public void i_click_on_Conform_Alert_Box() {

	}

	@When("I click on Cancel button, the allert goes away")
	public void i_click_on_Cancel_button_the_allert_goes_away() {

	}

	@When("I verify that I click on Cancel")
	public void i_verify_that_I_click_on_Cancel() {

	}

	@When("I click on Conform Prompt Alert Box")
	public void i_click_on_Conform_Prompt_Alert_Box() {

	}

	@When("I write Yes")
	public void i_write_Yes() {

	}

	@When("I click on ok button, the allert goes away")
	public void i_click_on_ok_button_the_allert_goes_away() {

	}

	@Then("I verify that I click on OK")
	public void i_verify_that_I_click_on_OK1() {

	}



	
}
