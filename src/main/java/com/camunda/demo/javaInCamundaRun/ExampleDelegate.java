package com.camunda.demo.javaInCamundaRun;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExampleDelegate implements JavaDelegate {


    private static final Logger log = LoggerFactory.getLogger(ExampleDelegate.class);

    @Override
    public void execute(DelegateExecution arg0) throws Exception {
        log.info("ExampleDelegate was called...");
    }   
}
