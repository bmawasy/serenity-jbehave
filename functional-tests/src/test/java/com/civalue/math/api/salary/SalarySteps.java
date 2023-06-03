package com.civalue.math.api.salary;

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
public class SalarySteps {
    private boolean isVisited = false;
    private long monthlySalary = 0;
    private final CalculatorStepsScenario calcService = new CalculatorStepsScenario();

    @Given("the employee monthly salary is $value dollar")
    public void givenSalaryValue(@Named("value") Long value) {
        if (!isVisited) {
            monthlySalary = value;
        } else {
            throw new RuntimeException(" unexpected value of isVisited=" + true);
        }
    }
    @When("the employee got his monthly salary to the bank account")
    public void whenIAddXToAccount() {
        isVisited = true;
        calcService.add(monthlySalary);
    }

    @Then("the yearly salary should be $value")
    public void thenXshouldBe(@Named("value") Long value) {
        if (!isVisited) {
            throw new RuntimeException(" unexpected value of isVisited=" + false);
        }
        Assert.assertEquals("Yearly salary is as expected", value.longValue(), (12 * monthlySalary));

    }
}
