package com.seerbit.demo.exception;

public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2066241912565436717L;
	
	public ResourceNotFoundException(String msg){
		super(msg);
	}
}
