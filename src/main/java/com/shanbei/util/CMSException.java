package com.shanbei.util;

//自定义异常.

public class CMSException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	
	public CMSException() {

	}

	public CMSException(String message) {
		super(message);
	}
}
