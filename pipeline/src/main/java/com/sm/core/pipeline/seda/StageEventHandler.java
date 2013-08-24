/**
 * 
 */
package com.sm.core.pipeline.seda;

/**
 * This is should be implemented in order to process StageEvents
 * 
 * @author smdeveloper
 * 
 */
public interface StageEventHandler<T> {

	/**
	 * handle a particular StageEvent. Include all application specific logic
	 * from here.
	 * 
	 * @param stEvt
	 * @throws StageException
	 */
	public void handleEvent(StageEvent stEvt) throws StageException;

}
