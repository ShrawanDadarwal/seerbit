package com.seerbit.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.seerbit.demo.util.TransactionCode;

@ControllerAdvice
@ResponseBody
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorMessage> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(TransactionCode.NO_DAT_FOU, new Date(), ex.getMessage(),
				request.getDescription(false));

		return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(TransactionFailedException.class)
	public ResponseEntity<ErrorMessage> transactionFailedException(TransactionFailedException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(TransactionCode.TRA_FAI, new Date(), ex.getMessage(),
				request.getDescription(false));

		return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ReferenceNumberMustBeUniqieException.class)
	public ResponseEntity<ErrorMessage> referenceNumberMustBeUniqueException(ReferenceNumberMustBeUniqieException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(TransactionCode.TRA_REF_MUS_BE_UNI, new Date(), ex.getMessage(),
				request.getDescription(false));

		return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PublicKeyNotNullException.class)
	public ResponseEntity<ErrorMessage> publicKeyCannotBeBlankException(PublicKeyNotNullException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(TransactionCode.MIS_PUB, new Date(), ex.getMessage(),
				request.getDescription(false));

		return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> globalExceptionHandler(Exception ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.toString(), new Date(), ex.getMessage(),
				request.getDescription(false));

		return new ResponseEntity<ErrorMessage>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
