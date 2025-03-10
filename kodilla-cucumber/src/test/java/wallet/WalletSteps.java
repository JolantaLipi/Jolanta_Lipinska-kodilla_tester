package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assert.assertEquals(30, cashSlot.getContents());
    }

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    @When("I request $200")
    public void i_request_200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("$200 should be dispensed")
    public void $200_should_be_dispensed() {
        Assert.assertEquals(200, cashSlot.getContents());
    }

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_200_in_my_wallet_for_more_than_balance() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    @When("I request $250")
    public void i_request_250() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 250);
    }

    @Then("I should be informed that the balance is insufficient")
    public void i_should_be_informed_that_the_balance_is_insufficient() {
        Assert.assertEquals(0, cashSlot.getContents());
        Assert.assertEquals("Insufficient balance", wallet.getBalance());
    }

    @Given("my wallet is empty")
    public void my_wallet_is_empty() {
        wallet.deposit(0);  // Ensure the wallet is empty
        Assert.assertEquals("Wallet should be empty", 0, wallet.getBalance());
    }

    @When("I request $50")
    public void i_request_50() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 50);
    }

    @Then("I should be informed that the wallet is empty")
    public void i_should_be_informed_that_the_wallet_is_empty() {
        Assert.assertEquals(0, cashSlot.getContents());
        Assert.assertEquals("Insufficient balance", wallet.getBalance());
    }

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_200_in_my_wallet_for_balance_check() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    @When("I request $50")
    public void i_request_50_for_balance_check() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 50);
    }

    @Then("$50 should be dispensed")
    public void $50_should_be_dispensed_for_balance_check() {
        Assert.assertEquals(50, cashSlot.getContents());
    }

    @Then("I should have $150 remaining in my wallet")
    public void i_should_have_150_remaining_in_my_wallet() {
        Assert.assertEquals("Incorrect remaining balance", 150, wallet.getBalance());
    }
}