package com.nagp.assignment.user.responsevo;

import java.util.Date;

public class FailureResponse {

	private String failureMessage;
	private String failureDescription;
	private Date timestamp;


	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	public String getFailureDescription() {
		return failureDescription;
	}

	public void setFailureDescription(String failureDescription) {
		this.failureDescription = failureDescription;
	}

	public FailureResponse(Date timestamp, String failureMessage, String failureDescription) {
		super();
		this.timestamp = timestamp;
		this.failureMessage = failureMessage;
		this.failureDescription = failureDescription;
	}

}
