package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BookDescription;


public class StepDef extends BookDescription {
	
	BookDescription book;
	
	@Given("^User opens the browser and go to webpage$")
	public void user_opens_the_browser_and_go_to_webpage() {
		book =new BookDescription();
	}

	@When("^User click shop menu$")
	public void user_click_shop_menu() {
		book.clickShop();
		
	}

	@When("^user click on Home menu$")
	public void user_click_on_Home_menu() {
		book.clickHome();
		
	}

	@When("^test home page has three arrivals only$")
	public void test_home_page_has_three_arrivals_only() {
		book.checkArrival();
	}

	@When("^check its only have three arrivals$")
	public void check_its_only_have_three_arrivals() {
		book.confirm();
		
	}

	@When("^user clicks image in the arrival$")
	public void user_clicks_image_in_the_arrival() {
		book.clickOnImage();
		
	}

	@When("^check whether it is navigating to next page$")
	public void check_whether_it_is_navigating_to_next_page() {
		book.checkingNavigation();
		
	}

	@When("^add that book into basket$")
	public void add_that_book_into_basket() {
		book.addToBasket();
	}

	@When("^user clicks book description$")
	public void user_clicks_book_description() {
		book.clickingDescription();
	}

	@Then("^check the user can see description$")
	public void check_the_user_can_see_description() {
		book.checkingDescription();
		
	}
	
}