/**
 * 
 */
package com.sm.core.pipeline.seda;

/**
 * A Sink represents the end of an finite length event queue. It supports
 * enqueue operations only. Each Stage will enqueue a StageEvent in a Sink after
 * processing it. If the Sink is full or closed then a SinkException is thrown
 * thus allowing event queues to support thresholding and back pressure.
 * 
 * @author smdeveloper
 * 
 */
public interface Sink<T> {

	/**
	 * 
	 * @param sEvent
	 */
	public void enqueue(T evt) throws StageException;

}
