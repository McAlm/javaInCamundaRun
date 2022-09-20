package com.camunda.demo.javaInCamundaRun;

import org.camunda.bpm.engine.impl.history.event.HistoryEvent;
import org.camunda.bpm.spring.boot.starter.event.ExecutionEvent;
import org.camunda.bpm.spring.boot.starter.event.TaskEvent;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


/**
 * see also https://docs.camunda.org/manual/7.17/user-guide/spring-boot-integration/the-spring-event-bridge/
 */
@Component
public class CustomHistoryEventHandler {

	private static final Logger log = LoggerFactory.getLogger(CustomHistoryEventHandler.class);

	@EventListener
	public void handleEvent(HistoryEvent historyEvent) {
		log.info("received history event: " + historyEvent.toString());
		// do whatever you want to do here...
	}

	@EventListener
	public void onTaskEvent(DelegateTask taskDelegate) {
		log.info("received mutable task event: " + taskDelegate.toString());
	}
  
	@EventListener
	public void onTaskEvent(TaskEvent taskEvent) {
		log.info("received immutable task event: " + taskEvent.toString());
	}


	@EventListener
	public void onExecutionEvent(DelegateExecution executionDelegate) {
		log.info("received mutable execution event: " + executionDelegate.toString());
	}
  
	@EventListener
	public void onExecutionEvent(ExecutionEvent executionEvent) {
		log.info("received immutable execution event: " + executionEvent.toString());
	}
}