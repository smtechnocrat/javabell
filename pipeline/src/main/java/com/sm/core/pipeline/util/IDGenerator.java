package com.sm.core.pipeline.util;

/**
 * 
 * @author smdeveloper
 *
 */
public interface IDGenerator {
	
	/**
	 * Get the next unique ID. Hides the ID implementation which can be UUID or any other 
	 * unique ID converted to a String 
	 * 
	 * If UUID is needed then convert from String to UUID
	 * 
	 * @return
	 */
	public String getID(); 

}
