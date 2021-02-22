package stepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BookReview;


public class StepDef extends BookReview
{
	BookReview book;
	@Given("^User opens the browser and go to webpage$")
	public void user_opens_the_browser_and_go_to_webpage() {
		book=new BookReview();
		
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

	@When("^user clicks book Review$")
	public void user_clicks_book_Review() {
		book.clickingReview();
	}

	@When("^adds review for book$")
	public void adds_review_for_book(DataTable arg1) {
		book.addReview("Good Book about for beginner","Ayush Kumar", "ayushkumar1234@gmail.com");
	}

	@When("^user clicks Submit$")
	public void user_clicks_Submit() {
		book.submitReview();
	}

	@Then("^check the user can see review$")
	public void check_the_user_can_see_review() {
		book.viewReview();
		
	}
}