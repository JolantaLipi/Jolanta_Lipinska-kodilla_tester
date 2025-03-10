import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class FizzBuzzStepDefinitions {

    private FizzBuzz fizzBuzz;
    private String result;

    @Given("I have a number {int}")
    public void i_have_a_number(int number) {
        fizzBuzz = new FizzBuzz();
        result = fizzBuzz.checkFizzBuzz(number);
    }

    @When("I check the number")
    public void i_check_the_number() {
        // Logic already handled in the Given step.
    }

    @Then("I should get {string}")
    public void i_should_get(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}
