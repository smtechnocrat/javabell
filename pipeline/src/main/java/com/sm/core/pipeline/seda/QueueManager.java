/**
 * 
 */
package com.sm.core.pipeline.seda;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Gauge;

/**
 * @author smdeveloper
 * 
 */
public class QueueManager {
	private final Queue queue;

	public QueueManager(MetricRegistry metrics, String name) {
		this.queue = new LinkedBlockingQueue<Integer>();
		metrics.register(MetricRegistry.name(QueueManager.class, name, "size"),
				new Gauge<Integer>() {
					@Override
					public Integer getValue() {
						return queue.size();
					}
				});
	}
}
