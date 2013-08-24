package com.sm.core.pipeline.seda;

public class StageException extends RuntimeException {

	private static final long serialVersionID = 1L;

	public StageException(String mesg) {
		super(mesg);
	}

	public StageException(Throwable th) {
		super(th);
	}

	public StageException(String mesg, Throwable th) {
		super(mesg, th);
	}
}
