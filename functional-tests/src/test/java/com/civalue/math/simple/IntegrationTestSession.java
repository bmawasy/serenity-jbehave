package com.civalue.math.simple;


/**
 * Our application has a lot of moving parts so it made sense to wrap some of the operations in an integration test
 * session.
 * Created by Bader Mawasy
 */
//@Service
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class IntegrationTestSession {

private Long x;

    public Long multiply(Long x) {
        this.x *=x;
        return this.x;
    }
    public void set(Long x) {
        this.x = x;
    }

    public Long getValue() {
        return this.x;
    }
}
