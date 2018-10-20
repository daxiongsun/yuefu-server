package com.jielingtianxia.yuefu.exception;

/**
 * <dl>
 * <dt>BaseException</dt>
 * <dd>Description:</dd>
 * <dd>CreateDate: 10/20/2018 6:44 PM</dd>
 * </dl>
 *
 * @author daxiong
 */
public class NoStackTraceException extends BaseException{
	
	private String code;
	private Object[] params;

	public NoStackTraceException(){
		this(null, null, false, true);
	}
	
	public NoStackTraceException(String msgCode) {
        this(msgCode, null, false, true);
        this.code = msgCode;
    }
	
	public NoStackTraceException(String msgCode, Object... params) {
        this(msgCode, null, false, true);
        this.code = msgCode;
        this.params = params;
    }
	
	public NoStackTraceException(String message, Throwable cause) {
		this(message, cause, false, true);
    }
	
	public NoStackTraceException(Throwable cause) {
        this(null, cause, false, true);
    }
	
	protected NoStackTraceException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public String getLessStackTrace(){
		StackTraceElement[] stackTraceArray = getStackTrace();
		StringBuilder sb = new StringBuilder();
		for(StackTraceElement st : stackTraceArray){
			String stLog = st.toString();
			if(stLog.contains("com.jielingtianxia.yuefu") && !stLog.contains("$"))
				sb.append("at ").append(stLog).append("\r\n");
		}
		return sb.toString();
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
