package com.parthu.user.exception;

public class UserNotFound extends RuntimeException {
	public UserNotFound() {

	}
	public UserNotFound(String msg) {
		super(msg);
	}

}
