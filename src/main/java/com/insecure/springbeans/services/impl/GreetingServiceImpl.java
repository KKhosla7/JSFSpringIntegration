package com.insecure.springbeans.services.impl;

import com.insecure.springbeans.services.GreetingService;

import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/25/13
 * Time: 5:57 PM
 */


@Named // JSR-330
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGreetingMessage() {
        return "Welcome to JSF 2 + Spring 3 Integration Annotation-Based Example.";
    }
}
