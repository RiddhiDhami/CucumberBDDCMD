package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class login {
    @Given("user calculated {int}+{int}")
    public void userCalculated(int arg0, int arg1) {
        System.out.println(arg0+arg1);
    }

    @Given("user is on login page")
    public void user_is_on_login_page(){
        System.out.println("user is on login page");

    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password(){

    }
    @And("click on login button")
    public void click_on_logoin_button(){}
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){}
    @Then("error message is displayed - Invalid Credentials")
    public void error_message_is_displayed_invalid_credentials() {
    }



}
