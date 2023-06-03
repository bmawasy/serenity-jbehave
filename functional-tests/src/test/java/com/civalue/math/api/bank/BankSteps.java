package com.civalue.math.api.bank;

import com.civalue.math.api.CalculatorStepsScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by Bader Mawasy on 01/06/2023.
 */
//@ScenarioScoped
//@Scope
public class BankSteps {
    private boolean isVisited = false;
    private final CalculatorStepsScenario calcService = new CalculatorStepsScenario();

    @Given("account has $value dollar in his bank account")
    public void givenXValue(@Named("value") Long value) {
        if (!isVisited) {
            calcService.set(value);
        } else {
            throw new RuntimeException(" unexpected value of isVisited=" + true);
        }
    }

    @When("he added $value to the account")
    public void whenIAdd(@Named("value") Long value) {
        isVisited = true;
        calcService.add(value);
    }

    @When("he withdrawn $value from my account")
    public void whenIWithdraw(@Named("value") Long value) {
        isVisited = true;
        calcService.subtract(value);
    }

    @Then("his accounts balance should equal to $value")
    public void thenXShouldBe(@Named("value") Long value) {
        Assert.assertEquals("result is not as expected", value, calcService.getValue());
    }
}
