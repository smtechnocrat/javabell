/**
 * 
 */
package com.sm.core.pipeline.seda;

/**
 * @author smdeveloper
 * 
 */
public interface Source<T> {

	/**
	 * @ToDo - create SourceException and throw StageException
	 * @return StageEvent
	 */
	public T dequeue() throws StageException;
    
	
}
