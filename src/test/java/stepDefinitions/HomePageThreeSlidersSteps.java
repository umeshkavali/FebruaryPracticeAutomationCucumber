package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class HomePageThreeSlidersSteps 
{
	public WebDriver driver;
	
	@Given("Open the browser")
	public void open_the_browser() 
	{
	    
	}

	@When("The User should navigates to the URL”")
	public void the_user_should_navigates_to_the_url(String url) 
	{
	    driver.get(url);
	}

	@Then("Click on Shop Menu")
	public void click_on_shop_menu() 
	{
	    
	}

	@Then("Now click on Home menu button")
	public void now_click_on_home_menu_button()
	{
	    
	}

	@When("Test whether the Home page has Three Sliders only")
	public void test_whether_the_home_page_has_three_sliders_only() 
	{
	    
	}

	@Then("The Home page must contains only three sliders")
	public void the_home_page_must_contains_only_three_sliders()
	{
	    
	}

	@Then("Finally User closed the browser")
	public void finally_user_closed_the_browser() 
	{
	    
	}
}
