package com.jielingtianxia.yuefu.exception;

public class ParamErrorException extends NoStackTraceException{

	public ParamErrorException(){
	}
	
	public ParamErrorException(String code){
		super(code);
	}
	
	public ParamErrorException(String code, Object... params){
		super(code, params);
	}
}
