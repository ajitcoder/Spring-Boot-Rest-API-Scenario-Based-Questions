package com.ajit.advice;

import java.time.LocalDateTime;

public class ErrorDetails {

	private String message;
	private Integer statusCode;
	private String path;
	private LocalDateTime timestamp;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	public ErrorDetails(String message, Integer statusCode, String path, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.path = path;
		this.timestamp = timestamp;
	}
	
	public ErrorDetails() {
		
	}
	
	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", statusCode=" + statusCode + ", path=" + path + ", timestamp="
				+ timestamp + "]";
	}
}