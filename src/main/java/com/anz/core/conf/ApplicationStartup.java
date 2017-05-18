package com.anz.core.conf;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Logger logger = Logger.getLogger(this.getClass());
		
		logger.info("Startup ....");
		
	}

}
