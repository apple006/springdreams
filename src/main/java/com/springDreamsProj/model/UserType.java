package com.springDreamsProj.model;

public enum UserType {
	USER("USER");
	
	String userType;
	
	private UserType(String userType){
		this.userType = userType;
	}
	
	public String getUserType() {
		return userType;
	}
	
}



