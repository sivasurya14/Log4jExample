package com.logexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Sample2 {
	static Logger log = Logger.getLogger(Sample.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		log.info("Log Information");
		log.error("Error Occurs");
		log.debug("Debugging");
		log.fatal("critical error");
		log.warn("Warning");

	}
}
