package com.logexample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Sample {

	static Logger log = Logger.getLogger(Sample.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		log.info("Log Information");
		log.error("Error Occurs");
		log.debug("Debugging");
		log.fatal("critical error");
		log.warn("Warning");

	}
}
