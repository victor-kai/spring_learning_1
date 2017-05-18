package com.anz.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class StartupRunner implements CommandLineRunner {

	protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);
	
	@Override
	public void run(String... arg0) throws Exception {

		logger.info("Startup .... ");
	}

}
