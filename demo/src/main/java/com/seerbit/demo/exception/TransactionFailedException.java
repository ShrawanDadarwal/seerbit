package com.seerbit.demo.exception;

public class TransactionFailedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8468555929552114164L;
	public TransactionFailedException(String msg) {
		super(msg);
	}

}
