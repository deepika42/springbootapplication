package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id @GeneratedValue
	private int userid;
	private String uname;
	private String feedback_data;

	@Override
	public String toString() {
		return "Feedback [userid=" + userid + ", uname=" + uname + ", feedback_data=" + feedback_data + "]";
	}

	public Feedback(String uname, String feedback_data) {
		super();
		this.uname = uname;
		this.feedback_data = feedback_data;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
