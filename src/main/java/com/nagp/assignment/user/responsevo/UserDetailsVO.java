package com.nagp.assignment.user.responsevo;

public class UserDetailsVO {

	private String name;
	private int age;
	private String email;

	public String getName() {
		return name;
	}

	public UserDetailsVO setName(String name) {
		this.name = name;
		return this;

	}

	public int getAge() {
		return age;
	}

	public UserDetailsVO setAge(int age) {
		this.age = age;
		return this;

	}

	public String getEmail() {
		return email;
	}

	public UserDetailsVO setEmail(String email) {
		this.email = email;
		return this;
	}

	public UserDetailsVO(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

}

