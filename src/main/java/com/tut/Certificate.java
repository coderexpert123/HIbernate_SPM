package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	
	private int course;
	private int duration;
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public Certificate(int course, int duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
