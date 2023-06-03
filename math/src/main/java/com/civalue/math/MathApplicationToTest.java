package com.civalue.math;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Bader Mawasy
 */
@SpringBootApplication
public class MathApplicationToTest {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(MathApplicationToTest.class);
        builder.headless(false).run(args);
    }

}
