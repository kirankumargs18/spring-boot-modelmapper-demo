package com.globallogic.dto;

public class StudentDto {

	private long id;
	private String name;
	private CourseDto course;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CourseDto getCourse() {
		return course;
	}

	public void setCourse(CourseDto course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

}
