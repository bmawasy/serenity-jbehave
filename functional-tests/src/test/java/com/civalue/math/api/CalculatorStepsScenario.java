package com.civalue.math.api;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Service;

/**
 * Our application has a lot of moving parts so it made sense to wrap some of the operations in an integration test
 * session.
 * Created by Bader Mawasy
 */
//@Service
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CalculatorStepsScenario {


    private final MathApi mathApiTest = Feign.builder()
            .decoder(new GsonDecoder()).encoder(new GsonEncoder())
            .target(MathApi.class, "http://localhost:9090/");

    public Long multiply(Long x) {
        return mathApiTest.multiply(x);
    }
    public Long divide(long x) {
        return mathApiTest.divide(x);
    }

    public Long add(Long x) {
        return mathApiTest.add(x);
    }

    public Long subtract(Long x) {
        return mathApiTest.subtract(x);
    }
    public void set(Long x) {
        mathApiTest.set(x);
    }
    public Long getValue() {
        return mathApiTest.getValue();
    }

}
