package com.civalue.math.simple;

import com.civalue.math.simple.IntegrationTestSession;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
/**
 * Created by Bader Mawasy on 01/06/2023.
 */
public class TestSteps {

    private IntegrationTestSession testSession = new IntegrationTestSession();

    @Given("a variable x with value $value")
    public void givenXValue(@Named("value") Long value) {
        testSession.set(value);
    }

    @When("I multiply x by $value")
    public void whenImultiplyXBy(@Named("value") Long value) {
        testSession.multiply(value);
    }

    @Then("result should equal $value")
    public void thenXshouldBe(@Named("value") Long value) {
        if (value != testSession.getValue())
            throw new RuntimeException("result is " + testSession.getValue() + ", but should be " + value);
    }
}
