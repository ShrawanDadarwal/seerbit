package com.seerbit.demo.exception;

public class ReferenceNumberMustBeUniqieException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6417063393022254757L;
	
	public ReferenceNumberMustBeUniqieException(String msg) {
		super(msg);
	}

}
