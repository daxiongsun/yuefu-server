package com.jielingtianxia.yuefu.exception;

public class NotExistedException extends NoStackTraceException{

	public NotExistedException(){
	}
	
	public NotExistedException(String code){
		super(code);
	}

	public NotExistedException(String code, Object... params){
		super(code, params);
	}
}
