package stepdef;

import cucumber.api.java.en.*;
import page.ThreeSlides;


public class InfoStepDef extends ThreeSlides {
	
	ThreeSlides slide;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page()  {
		slide=new ThreeSlides();
	}

	@When("^user click on shop Menu$")
	public void user_click_on_shop_Menu() {
		
	   slide.shopClick();
	}

	@When("^user clicks on home Menu btn$")
	public void user_clicks_on_home_Menu_btn(){
		slide.homeClick();
	    
	}

	@Then("^user is on home page with three slides$")
	public void user_is_on_home_page_with_three_slides() throws Throwable {
		slide.checkClick();

	}




}
