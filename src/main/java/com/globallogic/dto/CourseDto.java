package com.globallogic.dto;

public class CourseDto {

	private long id;
	private String name;
	private String instructorName;

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

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	@Override
	public String toString() {
		return "CourseDto [id=" + id + ", name=" + name + ", instructorName=" + instructorName + "]";
	}

}
