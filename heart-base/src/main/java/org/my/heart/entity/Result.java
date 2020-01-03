package org.my.heart.entity;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class Result implements Serializable {

	private static final long serialVersionUID = -3550425459172313382L;

	private static final String DEFAULT_SUCCESS_MESSAGE = "操作成功";

	private static final String DEFAULT_FAILURE_MESSAGE = "操作失败";

	private int code;

	private Boolean flag;

	private String message;

	private Object data;

	/**
	 * 操作成功
	 * 
	 * @return 结果对象
	 */
	public static Result ok() {
		return Result.build().setCode(2000).setFlag(true).setMessage(DEFAULT_SUCCESS_MESSAGE);
	}

	/**
	 * 操作成功
	 * 
	 * @param message 提示信息
	 * @return 结果对象
	 */
	public static Result ok(String message) {
		return Result.build().setCode(2000).setFlag(true).setMessage(message);
	}

	/**
	 * 操作成功，有响应数据
	 * 
	 * @param message 提示信息
	 * @param data    响应数据
	 * @return 结果对象
	 */
	public static Result ok(String message, Object data) {
		return Result.build().setCode(2000).setFlag(true).setMessage(message).setData(data);
	}

	/**
	 * 操作失败
	 * 
	 * @param code 响应码
	 * @return 结果对象
	 */
	public static Result failure(int code) {
		return Result.build().setCode(code).setFlag(false).setMessage(DEFAULT_FAILURE_MESSAGE);
	}

	/**
	 * 操作失败
	 * 
	 * @param code    响应码
	 * @param message 提示信息
	 * @return 结果对象
	 */
	public static Result failure(int code, String message) {
		return Result.build().setCode(code).setFlag(false).setMessage(message);
	}

	public static Result build() {
		return new Result();
	}

	public int getCode() {
		return code;
	}

	public Result setCode(int code) {
		this.code = code;
		return this;
	}

	public Boolean getFlag() {
		return flag;
	}

	public Result setFlag(Boolean flag) {
		this.flag = flag;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public Result setMessage(String message) {
		this.message = message;
		return this;
	}

	public Object getData() {
		return data;
	}

	public Result setData(Object data) {
		this.data = data;
		return this;
	}
	
	public String toJSONString() {
		return JSON.toJSONString(this);
	}

}
