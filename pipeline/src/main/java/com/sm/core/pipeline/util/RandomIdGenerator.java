package com.sm.core.pipeline.util;

import java.util.UUID;

/**
 * Uses Java's UUID implementation.
 * 
 * @author smdeveloper
 * 
 */
public class RandomIdGenerator implements IDGenerator {

	/**
	 * returns the next UUID, uses Java UUID
	 */
	public String getID() {
		return UUID.randomUUID().toString();
	}

}
