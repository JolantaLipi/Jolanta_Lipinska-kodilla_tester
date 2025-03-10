package seasonchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.MonthDay;

public class IsItSummerSteps {
    private MonthDay today;
    private String answer;

    @Given("today is last day of December")
    public void today_is_last_day_of_december() {
        this.today = MonthDay.of(12, 31);
    }
    @When("I ask whether it's Summer")
    public void i_ask_whether_it_s_summer() {
        this.answer = checkIfSummer(this.today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}