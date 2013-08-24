/**
 * 
 */
package com.sm.core.pipeline.seda;

/**
 * A StageQueue is connected to stages in a pipeline. The StageQueue can be the
 * Source or the Sink for a given Stage
 * 
 * @author smdeveloper
 * 
 */
public interface StageQueue<StageEvent> {

	/**
	 * Queue a StageEvent for processing by the Stage's event handler.
	 *  
	 * @param evt
	 * @throws StageException
	 */
	public void enqueue(StageEvent evt) throws StageException;

	/**
	 * Dequeue the event from the StageQueue
	 * 
	 * @param evt
	 * @throws StageException
	 */
	public void dequeue(StageEvent evt) throws StageException;

}
