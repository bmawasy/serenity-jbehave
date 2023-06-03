package com.civalue.math.api.calculator;

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
public class CalculatorSteps {
    private boolean isVisited = false;
    private final CalculatorStepsScenario calcService = new CalculatorStepsScenario();

    @Given("the server has a variable x with value $value")
    public void givenXValue(@Named("value") Long value) {
        if (!isVisited) {
            calcService.set(value);
        } else {
            throw new RuntimeException(" unexpected value of isVisited=" + true);
        }
    }

    @When("I multiply the server x by $value")
    public void whenImultiplyXBy(@Named("value") Long value) {
        isVisited = true;
        calcService.multiply(value);
    }

    @When("I divide the server x by $value")
    public void whenIDivideXBy(@Named("value") Long value) {
        isVisited = true;
        calcService.divide(value);
    }

    @When("I add to the server x, $value")
    public void whenIaddValueToX(@Named("value") Long value) {
        isVisited = true;
        calcService.add(value);
    }

    @When("I subtract to the server x, $value")
    public void whenISubtractValueFromX(@Named("value") Long value) {
        isVisited = true;
        calcService.subtract(value);
    }

    @Then("server result should equal $value")
    public void thenXshouldBe(@Named("value") Long value) {
        if (!isVisited) {
            throw new RuntimeException(" unexpected value of isVisited=" + false);
        }
        Assert.assertEquals("value is not the expected",value, calcService.getValue());
    }
}
