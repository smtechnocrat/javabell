package com.sm.core.pipeline.seda;

import java.util.concurrent.LinkedBlockingQueue;

public class BoundedBlockingQueue<E> extends LinkedBlockingQueue<E> {

	/**
	 * Don't allow this queue to be created without specifying the upper bound.
	 */
	private BoundedBlockingQueue() {
		super();
	}

	/**
	 * Specify a fixed upper bound
	 * @param capacity
	 */
	public BoundedBlockingQueue(int maxSize) {
		super(maxSize);
	}

	@Override
	public boolean offer(E e) {
		
		if (null == e) return false;
		
		try {
			put(e); // Block if the quueue is full
			return true;

		} catch (InterruptedException ie) {
			return false;
		}
	}

}
