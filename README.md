# Serenity & Jbehave

## combining Jbehave with serenity to present reports
This project is to show BDDs implementing JBehave to write the stories, 
and Serenity to present the results

## server side:
In order to run the integration test you need math server up, 
which found under math module, it is a spring application to Start a web application.
The server exposes multiple Math operations API, and have a local persistence.
The APIs can do basic math operations (set, multiply, divide, add and subtract) 
also get to return the current value.
To start up the server run the nex command at the CLI, or add a new service you IDE to Run the application.

### The server opens port 9090.
you may change this setting in the application.properties file.
In case that is done, please care to change the integration tests accordingly.

### Get current value
http://localhost:9090/math/api/x

### Other references
https://www.testingdocs.com/jbehave-framework-tutorial/

you can find more examples in the internet: 
example project combining Spring Boot and JBehave for Integration Testing
https://mindcollect.wordpress.com/2015/11/19/spring-boot-jbehave-example/
