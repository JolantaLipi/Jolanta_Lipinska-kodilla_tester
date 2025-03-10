package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps2 {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    // Feature: Prevent users from taking out more money than their wallet contains
    @Given("there is ${int} in my wallet")
    public void there_is_in_my_wallet(int amount) {
        wallet.deposit(amount);
        Assert.assertEquals("Incorrect wallet balance", amount, wallet.getBalance());
    }

    @When("I withdraw ${int}")
    public void i_withdraw(int amount) {
        cashSlot.reset();
        cashier.withdraw(wallet, amount);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assert.assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        Assert.assertEquals("Insufficient balance", wallet.getBalance());
    }

    // Feature: Display balance
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        // Do nothing for checking balance, as it's checked implicitly in the Then step
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(int expectedBalance) {
        Assert.assertEquals(expectedBalance, wallet.getBalance());
    }
}
