package com.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@AllArgsConstructor
public class UserEntity {

	public UserEntity(String userName, String password, String fullName, String age) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.age = age;
	}

	@Id
	@Column(name= "username")
	private String userName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "password")
	private String password;
	
	@Column(name = "fullname")
	private String fullName;
	
	@Column(name = "age")
	private String age;
}
