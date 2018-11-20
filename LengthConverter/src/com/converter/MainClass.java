package com.converter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {
	
	private final static Logger LOGGER =  
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	
	 public static void makeSomeLog() 
	    { 
	        // add some code of your choice here 
	        // Moving to the logging part now 
	        LOGGER.log(Level.INFO, "My first Log Message"); 
	  
	        // A log of INFO level with the message "My First Log Message" 
	    } 
	 
	 public static void main(String[] args) 
	    { 
		 	makeSomeLog();
	    }

}
