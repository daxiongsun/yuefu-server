package com.jielingtianxia.yuefu.exception;

public class ForbiddenException extends NoStackTraceException{
	
	public ForbiddenException(){
	}
	
	public ForbiddenException(String code){
		super(code);
	}
	
	public ForbiddenException(String code, Object... params){
		super(code, params);
	}

}
