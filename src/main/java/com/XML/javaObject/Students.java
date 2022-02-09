package com.XML.javaObject;

import java.util.List;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Students{

	List<Student> student;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(List<Student> student) {
		super();
		this.student = student;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Students [student=" + student + "]";
	}

}