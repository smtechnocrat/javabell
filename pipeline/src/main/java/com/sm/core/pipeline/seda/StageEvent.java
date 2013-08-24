package com.sm.core.pipeline.seda;

import java.io.Serializable;

import com.sm.core.pipeline.PipelineRequest;

/**
 * Represents all events processed by the SEDA pipeline.
 * 
 * @author smdeveloper
 * 
 */
public class StageEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	private static String DEFAULT_EVENT;
	/**
	 * Name of the event.
	 */
	private String eventName = DEFAULT_EVENT;

	/**
	 * Event request to be processed. Contains all the payload and any other
	 * processing context.
	 */
	private PipelineRequest request;

	/**
	 * Disallow default constructor
	 */
	private StageEvent() {
	};

	/**
	 * Constructor
	 * 
	 * @param evtName
	 * @param req
	 */
	public StageEvent(String evtName, PipelineRequest req) {

		if (null != evtName && evtName.trim().length() > 0)
			this.eventName = evtName;

		this.request = req;
	}

	public String getEventName() {
		return eventName;
	}

	public PipelineRequest getRequest() {
		return request;
	}

}
