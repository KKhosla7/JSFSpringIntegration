package com.insecure.managedbeans.view;

import com.insecure.springbeans.services.GreetingService;
import org.springframework.context.annotation.Scope;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/25/13
 * Time: 5:52 PM
 */

@Named // JSR-330 in Spring context, Singleton
@Scope("request")
public class GreetingsBean {

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String viewSpringServiceMsg() {
        return greetingService.getGreetingMessage();
    }

    @Inject // JSR-330 in Spring context, Singleton
    private GreetingService greetingService;

}
