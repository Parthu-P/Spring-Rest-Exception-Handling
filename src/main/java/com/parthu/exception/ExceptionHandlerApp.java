package com.parthu.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.parthu.binding.ErrorInfo;
import com.parthu.user.exception.UserNotFound;

@RestControllerAdvice
public class ExceptionHandlerApp {
	
	@ExceptionHandler(value=UserNotFound.class)
	public ResponseEntity<ErrorInfo> userDefindExceptionHandler(UserNotFound ex){
		String msg = ex.getMessage();
		ErrorInfo info=new ErrorInfo();
		info.setCode("SBIEX0001");
		info.setMsg(msg);
		info.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
	}
	

	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ErrorInfo> exceptionHandler(Exception ex){
		String msg = ex.getMessage();
		ErrorInfo info=new ErrorInfo();
		info.setCode("SBIEX0001");
		info.setMsg(msg);
		info.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
