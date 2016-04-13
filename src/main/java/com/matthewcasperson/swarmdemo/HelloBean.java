package com.matthewcasperson.swarmdemo;

import org.apache.camel.Header;
import org.apache.camel.language.Simple;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * A CDI bean that can be consumed by Camel
 */
@Singleton
@Named("myBean")
public class HelloBean {

    public String sayHello(@Header("name") final String name, @Simple("${sys.user.country}") final String country) {
        return "Hello " + name + ", how are you? You are from: " + country;
    }

}