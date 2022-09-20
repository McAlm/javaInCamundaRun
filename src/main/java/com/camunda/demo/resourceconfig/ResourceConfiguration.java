package com.camunda.demo.resourceconfig;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
@AutoConfigureOrder(Ordered.LOWEST_PRECEDENCE)
@ConditionalOnBean(type = "org.camunda.bpm.engine.ProcessEngine")
public class ResourceConfiguration {
	
	@Configuration
	@ComponentScan("com.camunda.demo.javaInCamundaRun")
	public static class EmbeddedConfiguration {
		
	}
	
}
