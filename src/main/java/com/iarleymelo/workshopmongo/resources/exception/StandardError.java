package com.iarleymelo.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{

	 private static final long serialVersionUID = 1L;
	
	private Long timeStamp;
	private Integer status;
	private String error;
	private String messege;
	private String path;
	
	public StandardError() {}

	public StandardError(Long timeStamp, Integer status, String error, String messege, String path) {
		this.timeStamp = timeStamp;
		this.status = status;
		this.error = error;
		this.messege = messege;
		this.path = path;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
