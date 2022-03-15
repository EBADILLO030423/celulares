package stepsDefinitionsCelulares;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import excerciseMap.ExcerciseMap;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExcercisePage {
	WebDriver driver = SetupClass.driver;
	ExcerciseMap ex;

	@Given("User should be in {string}")
	public void user_should_be_in(String page) {
	}
	@When("User should be able to click phones button and see the smartphones")
	public void user_should_be_able_to_click_phones_button_and_see_the_smartphones() {
		ex.celulares.click();
		Assert.assertTrue(ex.celulares.isSelected());
	}
	@When("user shoud be able to click the button laptops and see the laptops")
	public void user_shoud_be_able_to_click_the_button_laptops_and_see_the_laptops() {
		ex.laptops.click();
		Assert.assertTrue(ex.laptops.isSelected());
	}
	@When("user shoud be able to click the button monitors and see the monitors")
	public void user_shoud_be_able_to_click_the_button_monitors_and_see_the_monitors() {
		ex.monitores.click();
		Assert.assertTrue(ex.monitores.isSelected());
	}



}
