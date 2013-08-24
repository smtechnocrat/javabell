/**
 * 
 */
package com.sm.core.pipeline;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author smdeveloper
 * 
 */
public class PipelineRequest implements Serializable {

	private static final long serialVersionID = 1L;

	// An unique ID in order to identify and trace a request in the pipeline
	private String requestID = UUID.randomUUID().toString();

	// Identity the system or user responsible for this request.
	private User requestedBy;

	// Contains any context information associated with this request.
	private Object requestContext;

	/**
	 * Constructor
	 * 
	 * @param usr
	 * @param reqContext
	 */
	public PipelineRequest(User usr, Object reqContext) {

		if (usr == null)
			throw new IllegalArgumentException(this.getClass()
					+ "[ User entity cannot be null. ]");
		this.requestedBy = usr;
		this.requestContext = reqContext;
	}

	/**
	 * returns the request ID.
	 * 
	 * @return
	 */
	public String getId() {
		return this.requestID;
	}

	/**
	 * Returns the user or entity information for this request.
	 * 
	 * @return
	 */
	public User getRequestedBy() {
		return this.requestedBy;
	}

	/**
	 * returns the context for this request. Can be null.
	 * 
	 * @return
	 */
	public Object getRequestContext() {
		return this.requestContext;
	}

}
