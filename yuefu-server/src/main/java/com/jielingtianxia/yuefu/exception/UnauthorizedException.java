package com.jielingtianxia.yuefu.exception;

public class UnauthorizedException extends NoStackTraceException{

	public UnauthorizedException(){
	}
	
	public UnauthorizedException(String code){
		super(code);
	}
	public UnauthorizedException(String code, Object... params){
		super(code, params);
	}
}
