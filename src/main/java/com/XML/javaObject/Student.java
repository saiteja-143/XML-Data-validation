package com.XML.javaObject;

public class Student {


	String name;


	String age;


	


	String gender;


	String mobile;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String age, String gender, String mobile) {
		super();
		this.name = name;
		this.age = age;
		
		this.gender = gender;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age  +",gender="+gender+ ", mobile="
				+ mobile +"]";
	}
}

